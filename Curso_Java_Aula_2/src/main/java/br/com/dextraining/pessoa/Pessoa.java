package br.com.dextraining.pessoa;

import java.util.Scanner;

public class Pessoa {
	String nome;
	String cpf;
	String rg;
	
	//Construtor
	public Pessoa(String nome, String cpf, String rg){
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	//Botão direito > Source > Generate toString()...
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + "]";
	}
}
