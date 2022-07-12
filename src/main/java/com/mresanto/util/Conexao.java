package com.mresanto.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	protected static Connection _con ;
	protected static String url = "jdbc:mysql://localhost:3306/CrudJava";
	protected static String root = "root";
	protected static String password = "root";
	
	public static Connection OpenConnection() {
		
		if( _con != null ) {
			
			return _con ;
		}
						
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
			_con = DriverManager.getConnection(url, root, password);
			
		} catch (Exception e) {
		System.out.print("Print Error: " + e);
		e.printStackTrace();
		}
		
		
		return _con;
		
	}
	
	public static void CloseConnection() {
		
		if(_con == null) {
			
			return ;
		}
		try {
			_con.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		 
	}
}
