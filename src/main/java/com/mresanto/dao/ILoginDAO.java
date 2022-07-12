package com.mresanto.dao;

import java.util.List;

import com.mresanto.model.Login;

public interface ILoginDAO {
	
	void Salvar(Login login);

	void Apagar(int personaId);

	void Atualizar(Login login);
	
	Login ListarPorId(int id);
	
	List<Login> Listar();

}
