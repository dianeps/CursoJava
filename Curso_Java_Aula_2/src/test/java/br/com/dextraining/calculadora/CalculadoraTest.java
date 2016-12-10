package br.com.dextraining.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora calculadora = new Calculadora();
	
	@Test
	public void testarSoma(){
		double resultado = calculadora.somar(10, 1);		
		Assert.assertEquals(Double.valueOf(11), Double.valueOf(resultado));
	}
	
	@Test
	public void testarSubtracao(){
		double resultado = calculadora.subtrair(10, 1);		
		Assert.assertEquals(Double.valueOf(9), Double.valueOf(resultado));
	}
	
	@Test
	public void testarDivisao(){
		double resultado = calculadora.dividir(10, 1);		
		Assert.assertEquals(Double.valueOf(10), Double.valueOf(resultado));
	}
	
	@Test
	public void testarMultiplicacao(){
		double resultado = calculadora.multiplicar(10, 1);	
		Assert.assertEquals(Double.valueOf(10), Double.valueOf(resultado));
	}
}
