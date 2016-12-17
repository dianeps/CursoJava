package Aula1;

import java.util.Scanner;

public class VerificaIdade {
	public static void main(String[] args) {			
		System.out.println("Informe sua idade:");
		Scanner scanner = new Scanner(System.in);
		int idade = scanner.nextInt();
		
		System.out.println(idade>=18?"Maior de Idade.":"Menor de Idade.");
		
		scanner.close();
	}
}