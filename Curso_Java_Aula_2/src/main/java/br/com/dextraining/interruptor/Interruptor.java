package br.com.dextraining.interruptor;

public class Interruptor {
	public Lampada lampada;

	public Interruptor(Lampada lampada) {
		this.lampada = lampada;
	}

	public void apertar() {
		if (lampada.estaLigada()) {
			lampada.desligar();
		} else {
			lampada.ligar();
		}
	}
}
