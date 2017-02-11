package br.com.dextra.financas.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.dextra.financas.modelo.Conta;

public class TesteJDBCMySQL {

	public static void main(String[] args) throws SQLException {

		Conta conta = new Conta();
		conta.setTitular("Jorge Magnani");
		conta.setBanco("Banco do Brasil");
		conta.setAgencia("0000");
		conta.setNumero("0000-7");

		Connection con = new ConnectionFactory().getConnectionMySQL();

		con.setAutoCommit(false);

		ContaDAO dao = new ContaDAO(con);
		dao.adiciona(conta);

		List<Conta> lista = dao.lista();

		for (Conta c : lista) {
			System.out.println(c.getTitular());
		}

		con.commit();
		con.close();
	}

}
