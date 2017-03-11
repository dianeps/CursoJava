package br.com.dextra.service;

import br.com.dextra.testesrelacionamentos.Agencia;

public class AgenciaService {

	public static Agencia inserir(Agencia a) {
		EntityManagerUtil.begin();
		EntityManagerUtil.getEM().persist(a);
		EntityManagerUtil.commit();
		return a;
	}
	
}
