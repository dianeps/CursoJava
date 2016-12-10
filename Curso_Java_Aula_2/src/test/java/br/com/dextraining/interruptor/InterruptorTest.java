package br.com.dextraining.interruptor;

import org.junit.Assert;
import org.junit.Test;

import br.com.dextraining.interruptor.Interruptor;
import br.com.dextraining.interruptor.Lampada;

public class InterruptorTest {
	@Test
	public void testarLigar() {
		Lampada lampada = new Lampada("Philips", 60);
		Interruptor interruptor = new Interruptor(lampada);
		interruptor.apertar();

		Assert.assertTrue(lampada.estaLigada());
	}

	@Test
	public void testarDesligar() {
		Lampada lampada = new Lampada("Philips", 60);
		Interruptor interruptor = new Interruptor(lampada);
		
		interruptor.apertar();
		Assert.assertTrue(lampada.estaLigada());
		
		interruptor.apertar();
		Assert.assertFalse(lampada.estaLigada());
	}
}
