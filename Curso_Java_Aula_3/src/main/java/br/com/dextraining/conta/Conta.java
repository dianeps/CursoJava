 package br.com.dextraining.conta;

public class Conta {
	private double saldo = 1000;
	boolean realizado;
		
	//construtor
	public Conta(boolean realizado, double saldo) {		
		this.saldo = saldo;
		this.realizado = realizado;
	}

	//metodos
	public boolean sacar(double valor){
		if (saldo >= valor){
			saldo = saldo - valor;
			realizado = true;
		} else {
			realizado = false;
		}
		return realizado;
	}
	
	public boolean depositar(double valor){
		if (valor > 0){
			saldo = saldo + valor;
			realizado = true;
		} else {
			realizado = false;
		}
		return realizado;
	}
	
	public double obterSaldo(){
		return saldo;
	}
}
