package br.com.dextra.financas.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BD {

	private Connection connection;

	public BD(Connection connection) {
		this.connection = connection;
	}

	public void geraTabelaContas() {

		try {
						
			String schema = " CREATE TABLE public.conta (titular character(250), numero character(250), "
					+ "banco character(250), agencia character(250) )";
			
			Statement statement = this.connection.createStatement();
			statement.execute(schema);
		} catch (SQLException e) {
			// ignora se a tabela já existe
			System.out.println("Tabela conta já foi criada!");
		}

	}

}
