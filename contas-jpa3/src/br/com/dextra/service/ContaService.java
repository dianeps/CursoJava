package br.com.dextra.service;

import br.com.dextra.financas.modelo.Conta;


public class ContaService {
	
	
	public static Conta inserir(Conta c) {
		EntityManagerUtil.begin();
		EntityManagerUtil.getEM().persist(c);
		EntityManagerUtil.commit();
		return c;
	}
	
	
	public static Conta buscarPorId(Long id) {
		return EntityManagerUtil.getEM().find(Conta.class, id);
	}

}
