package br.com.dextraining.arraysExercicio2;

public class Aluno {
	private String nome;
	private double notas[];
	
	//construtor (recebe valor de outras classes)
	public Aluno(String nome, double nota[]) {		
		this.nome = nome;
		this.notas = nota;
	}
	
	//metodo
	public double Media(){
		double soma = 0;
		
		for(int i = 0; i < notas.length; i++){
			soma += notas[i];
		}
		return (soma/notas.length);		
	}
	
	//javaBeans - Sempre publico e do tipo void (recebe valor)
	public void setNome(String nome){
		this.nome = nome;
	}
	
	//javaBeans - Sempre publico e do tipo do dado que vai retornar
	public String getNome(){
		return nome;
	}
	
	public void setNotas(double[] notas){
		this.notas = notas;
	}
	
	public double[] getNotas(){
		return notas;
	}
}
