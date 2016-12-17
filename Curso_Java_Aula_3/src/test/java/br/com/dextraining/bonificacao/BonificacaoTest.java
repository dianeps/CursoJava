package br.com.dextraining.bonificacao;

import org.junit.Test;

public class BonificacaoTest {

	@Test
	public void mudarSalario() {
		Funcionario func = new Funcionario();
		func.setSalario(1000);
	}

	@Test(expected = IllegalArgumentException.class)
	public void mudarSalarioParaMenor() {
		Funcionario func = new Funcionario();
		func.setSalario(1000);
		func.setSalario(500);
	}
}
