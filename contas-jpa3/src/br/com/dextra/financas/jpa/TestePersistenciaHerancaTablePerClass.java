package br.com.dextra.financas.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.dextra.testesheranca.PessoaFisicaTablePerClass;
import br.com.dextra.testesheranca.PessoaJuridicaTablePerClass;

public class TestePersistenciaHerancaTablePerClass {
	
	public static void main(String[] args) {
		
		//PessoaTablePerClass p1 = new PessoaTablePerClass();
		//PessoaTablePerClass p2 = new PessoaTablePerClass();
		PessoaFisicaTablePerClass pfTablePerClass = new PessoaFisicaTablePerClass();
		PessoaJuridicaTablePerClass pjTablePerClass = new PessoaJuridicaTablePerClass();
		
		
		//p1.setNome("Z�");
		pfTablePerClass.setNome("Maria dos santos");
		pfTablePerClass.setEndereco("Rua da Pessoa Fisica, 0001");
		pfTablePerClass.setCPF("111.111.111-11");
		
		//p2.setNome("Jo�o");
		
		pjTablePerClass.setNome("Empresa de Pão");
		pjTablePerClass.setEndereco("Rua da Pessoa Juridica, 0002");
		pjTablePerClass.setCNPJ("000000/0001");
		
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("contas-mysql");

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		//em.persist(p1);
		//em.persist(p2);
		em.persist(pfTablePerClass);
		em.persist(pjTablePerClass);

		em.getTransaction().commit();
		em.close();
		
		
	}

}
