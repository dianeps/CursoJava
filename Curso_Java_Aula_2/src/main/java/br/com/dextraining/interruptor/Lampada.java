package br.com.dextraining.interruptor;

public class Lampada {
	public String fabricante;
	public int watts;
	public boolean ligada;

	public Lampada(String fabricante, int watts) {
		this.fabricante = fabricante;
		this.watts = watts;
		this.ligada = false;
	}

	public void ligar() {
		System.out.println("Ligando... ");
		ligada = true;
	}

	public void desligar() {
		System.out.println("desligando... ");
		ligada = false;
	}

	public boolean estaLigada() {
		return ligada;
	}	
}
