package br.com.dextraining.televisao;

public class Televisao {
	private boolean ligada;
	private int volume;
	
	public boolean ligar(){
		System.out.println("A TV está ligada");
		ligada = true;
		return ligada;
	}
	
	public boolean desligar(){
		System.out.println("A TV está desligada");
		ligada = false;
		return ligada;
	}
	
	public int aumentarVolume(){
		System.out.println("O volume foi aumentado em " + volume);		
		return volume;
	}
	
	public int diminuirVolume(){
		System.out.println("O volume foi diminuido em " + volume);
		return volume;
	}
	
	public ajustarVoltagem(){
		
	}
	
	public int aumentarCanal(){
		
	}
	
	public int diminuirCanal(){
		
	}
	
	private boolean ligarTela(){
		
	}
	
	private int regularDiodo(){
		
	}
	
}
