package br.com.dextra.financas.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.dextra.financas.modelo.Conta;

public class TesteJPA {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setTitular("Jose dos Santos");
		conta.setBanco("BB");
		conta.setAgencia("043");
		conta.setNumero("53327");

		/**
		 * Usando HSQLDB
		 */

		// EntityManagerFactory emf = Persistence
		// 		.createEntityManagerFactory("contas-hsqldb");

		/**
		 * Usando PostgreSQL
		 */
		EntityManagerFactory emf = Persistence
		 		.createEntityManagerFactory("contas-postgres");

		/**
		 * Usando MySQL
		 */
		//EntityManagerFactory emf = Persistence
		//		.createEntityManagerFactory("contas-mysql");

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.persist(conta);

		em.getTransaction().commit();
		em.close();
	}
}