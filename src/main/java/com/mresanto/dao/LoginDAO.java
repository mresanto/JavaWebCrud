package com.mresanto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mresanto.model.Login;
import com.mresanto.util.Conexao;

public class LoginDAO implements ILoginDAO {

	private Connection cx;

	public LoginDAO() {
		cx = Conexao.OpenConnection();
	}
	
	@Override
	public void Salvar(Login login) {
		try {
			String sql = "INSERT INTO LOGIN VALUES (0,?,?,?,?);";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, login.getUsername());
			preparedStatement.setString(2, login.getPswd());
			preparedStatement.setString(3, login.getFullname());
			preparedStatement.setString(4, login.getEmail());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Apagar(int loginID) {
		try {
			String sql = "DELETE FROM LOGIN WHERE USER_ID = ?;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, loginID);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Atualizar(Login login) {
		try {
			String sql = "UPDATE LOGIN SET USERNAME = ?, PSWD = ?, FULLNAME = ?, EMAIL = ? WHERE USER_ID = ?;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, login.getUsername());
			preparedStatement.setString(2, login.getPswd());
			preparedStatement.setString(3, login.getFullname());
			preparedStatement.setString(4, login.getEmail());
			preparedStatement.setInt(5, login.getUser_id());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Login> Listar() {
		List<Login> logins = new ArrayList<>();
		try {
			Statement statement = cx.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM LOGIN");
			while (result.next()) {
				Login login = new Login();
				login.setUser_id(result.getInt(1));
				login.setUsername(result.getString(2));
				login.setPswd(result.getString(3));
				login.setFullname(result.getString(4));
				login.setEmail(result.getString(5));
				logins.add(login);
			}
			result.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//Conexion.desconectar();
		}
		return logins;
	}

	@Override
	public Login ListarPorId(int loginID) {
		Login login = new Login();
		try {
			String query = "SELECT * FROM LOGIN WHERE USER_ID =?";
			PreparedStatement preparedStatement = cx.prepareStatement(query);
			preparedStatement.setInt(1, loginID);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				login.setUser_id(resultSet.getInt(1));
				login.setUsername(resultSet.getString(2));
				login.setPswd(resultSet.getString(3));
				login.setFullname(resultSet.getString(4));
				login.setEmail(resultSet.getString(5));

			}
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return login;
	}

}
