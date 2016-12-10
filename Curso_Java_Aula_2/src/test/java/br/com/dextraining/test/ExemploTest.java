package br.com.dextraining.test;

import org.junit.*;

public class ExemploTest {
	
	@Test	
	public void testarSoma(){
		int valor1 = 10, valor2 = 20;
		int resultado = valor1 + valor2;
		
		//
		Assert.assertEquals(30, resultado);
	}
}
