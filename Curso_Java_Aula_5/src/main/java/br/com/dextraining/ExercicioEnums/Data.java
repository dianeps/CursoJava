package br.com.dextraining.ExercicioEnums;

public class Data {
	 private MesesAno Mes;
	 private int dia;
	 private int ano;	 
	 
	 public Data(int dia, MesesAno mes, int ano){
		 if (!mes.diaValido(dia, ano)){
			 throw new IllegalArgumentException
		 }
	 }
}
