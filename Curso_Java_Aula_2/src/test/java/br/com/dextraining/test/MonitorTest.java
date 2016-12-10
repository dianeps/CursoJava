package br.com.dextraining.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.dextraining.monitor.Monitor;

public class MonitorTest {
	
	Monitor monitor;

	@Test
	public void testarCriacaoMonitor() {
		monitor = new Monitor();
		monitor.cor = "PRETO";
		monitor.polegadas = 20;
		monitor.numeroSerie = "1";
		assertDadosMonitor();
	}

	@Test
	public void testarCriacaoMonitorComConstrutor() {
		monitor = new Monitor(20, "1", "PRETO");
		assertDadosMonitor();
	}

	@Test
	public void testarMaximoDeBrilho() {
		monitor = new Monitor();

		for (int i = 0; i < 101; i++) {
			monitor.aumentarBrilho();
		}
		Assert.assertEquals(100, monitor.brilho);
	}

	@Test
	public void testarMinimoBrilho() {
		monitor = new Monitor();

		for (int i = 0; i < 101; i++) {
			monitor.diminuirBrilho();
		}
		Assert.assertEquals(0, monitor.brilho);
	}

	@Test
	public void testarLigar() {
		monitor = new Monitor();
		Assert.assertFalse(monitor.ligado);
		monitor.ligar();
		Assert.assertTrue(monitor.ligado);
	}

	@Test
	public void testarDesligar() {
		monitor = new Monitor();
		Assert.assertFalse(monitor.ligado);
		monitor.ligar();
		Assert.assertTrue(monitor.ligado);
		monitor.desligar();
		Assert.assertFalse(monitor.ligado);
	}

	@Test
	public void testarAlterar() {
		monitor = new Monitor();
		int brilhoInicial = monitor.brilho;
		monitor.trocarBrilho(150);
		Assert.assertEquals(brilhoInicial, monitor.brilho);
		monitor.trocarBrilho(-5);
		Assert.assertEquals(brilhoInicial, monitor.brilho);
		monitor.trocarBrilho(30);
		Assert.assertEquals(30, monitor.brilho);
	}

	private void assertDadosMonitor() {
		Assert.assertNotNull(monitor);
		Assert.assertFalse(monitor.ligado);
		Assert.assertEquals(50, monitor.brilho);
		Assert.assertEquals("PRETO", monitor.cor);
		Assert.assertEquals(20, monitor.polegadas);
		Assert.assertEquals("1", monitor.numeroSerie);
	}
}
