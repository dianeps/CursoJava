package br.com.dextra.service;

import br.com.dextra.testesrelacionamentos.PacoteServicos;

public class PacoteServicoService {
	
	public static PacoteServicos inserir(PacoteServicos p) {
		EntityManagerUtil.begin();
		EntityManagerUtil.getEM().persist(p);
		EntityManagerUtil.commit();
		return p;
	}

}
