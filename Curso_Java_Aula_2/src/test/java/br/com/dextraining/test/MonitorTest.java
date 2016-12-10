package br.com.dextraining.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.dextraining.monitor.Monitor;

public class MonitorTest {
	
	Monitor monitor;
	
	@Test
	public void testarCriacaoMonitor(){
		monitor = new Monitor(20, "1", "Preto");
				
		Assert.assertNotNull(monitor);
		Assert.assertFalse(monitor.ligado);
		Assert.assertEquals(50, monitor.brilho);
		
	}
	
	@Test
	public void testarMaximoBrilho(){
		monitor = new Monitor(20, "1", "Preto");
		
		for (int i = 0;i < 101; i++){
			monitor.diminuirBrilho();
		}
	}
}
