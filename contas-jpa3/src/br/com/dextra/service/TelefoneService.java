package br.com.dextra.service;

import br.com.dextra.testesrelacionamentos.Telefone;

public class TelefoneService {

	public static Telefone inserir(Telefone t) {
		EntityManagerUtil.begin();
		EntityManagerUtil.getEM().persist(t);
		EntityManagerUtil.commit();
		return t;
	}
	
}
