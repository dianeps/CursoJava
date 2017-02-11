package br.com.dextra.financas.jpa;

import javax.persistence.EntityManager;

import br.com.dextra.financas.modelo.Investimento;
import br.com.dextra.financas.modelo.PessoaInvestimento;
import service.JPAUtil;

public class PopularInvestimento {
	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();
		
		Investimento Investimento1 = new Investimento();
		Investimento Investimento2 = new Investimento();
		
		Investimento1.setDescricao("Tesouro Direto");
		Investimento1.setValor(2200.99);
		Investimento1.setRendimentoMensal(.5);
				
		Investimento2.setDescricao("Acoes");
		Investimento2.setValor(30000.01);
		Investimento2.setRendimentoMensal(1.1);
				
		manager.persist(Investimento1);
		manager.persist(Investimento2);
		
		manager.getTransaction().commit();
		
		manager.close();
	}
}

/*
 * import java.util.ArrayList;
import java.util.List;

import br.com.banco.service.InvestimentoService;
import br.com.dextra.financas.modelo.Investimento;

public class TesteInvestimentoJPA {
	
	public static void main(String[] args) {
		
		
		// Criado novo investimento
		Investimento di = new Investimento();
		Investimento poup = new Investimento();
		Investimento lci = new Investimento();
		
		di.setDescricao("Tesouro Direto");
		di.setValor(1000D);
		di.setRendimentoMensal(.5D);
		
		poup.setDescricao("Fundo DI");
		poup.setValor(45000D);
		poup.setRendimentoMensal(0.6D);
		
	
		lci.setDescricao("LCI");
		lci.setValor(3400D);
		lci.setRendimentoMensal(1.1D);
		
		// Peristindo dados atraves da classe InvestimentoService
		InvestimentoService.inserir(di);
		InvestimentoService.inserir(poup);
		InvestimentoService.inserir(lci);
		
		
*/