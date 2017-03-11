package br.com.dextra.service;

import br.com.dextra.testesrelacionamentos.Endereco;

public class EnderecoService {

	public static Endereco inserir(Endereco e) {
		EntityManagerUtil.begin();
		EntityManagerUtil.getEM().persist(e);
		EntityManagerUtil.commit();
		return e;
	}
	
}
