package br.com.dextra.financas.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.dextra.financas.modelo.Conta;
import br.com.dextra.financas.jdbc.BD;

public class TesteJDBCPostgre {

	public static void main(String[] args) throws SQLException {

		Conta conta = new Conta();
		conta.setTitular("Jorge Magnani");
		conta.setBanco("Banco do Brasil");
		conta.setAgencia("0000");
		conta.setNumero("0000-7");

		// Abrindo conexao com BD
		Connection con = new ConnectionFactory().getConnectionPOSTGRE();

		// Criando tabela de contas
		BD bd = new BD(con);
		bd.geraTabelaContas();
		
		// Criando objeto conta
		con.setAutoCommit(false);

		ContaDAO dao = new ContaDAO(con);
		dao.adiciona(conta);

		List<Conta> lista = dao.lista();

		for (Conta c : lista) {
			System.out.println(c.getTitular());
			System.out.println(c.getBanco());
			System.out.println(c.getAgencia());
			System.out.println(c.getNumero());			
		}

		con.commit();
		con.close();
	}
	
}
