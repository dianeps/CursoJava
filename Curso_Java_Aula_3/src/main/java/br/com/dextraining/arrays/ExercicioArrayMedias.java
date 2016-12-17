package br.com.dextraining.arrays;

import java.util.Scanner;

public class ExercicioArrayMedias {
	public static void main(String[] args) {
		double valores[] = new double [3];
		double soma = 0;
		double media = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < valores.length; i++){
			System.out.print("Informe o " + i +  " numero: ");
			valores[i] = scanner.nextDouble();
		}
		
		for(int j = 0; j < valores.length; j++){			
			soma += valores[j];			
		}		
		System.out.println("Média: " + (media = (soma/valores.length)));
	}
}
