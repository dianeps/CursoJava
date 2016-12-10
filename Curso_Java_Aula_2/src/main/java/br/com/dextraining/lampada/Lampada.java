package br.com.dextraining.lampada;

public class Lampada {
	int numWatts;
	String fabricante;
	boolean ligada;
		
	//Metodos	
	public void ligar(){
		System.out.println("Ligando...");
		ligada = true;
	}
	
	public void desligar(){
		System.out.println("Desligando...");
		ligada = false;
	}
	
	@Override
	public String toString() {
		return "Lampada [numWatts=" + numWatts + ", fabricante=" + fabricante
				+ ", ligada=" + ligada + "]";
	}

	public Lampada(int numWatts, String fabricante, boolean ligada) {
		super();
		this.numWatts = numWatts;
		this.fabricante = fabricante;
		this.ligada = ligada;
	}	
}
