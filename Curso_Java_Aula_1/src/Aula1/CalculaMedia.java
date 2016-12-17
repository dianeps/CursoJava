package Aula1;

import java.util.Locale;
import java.util.Scanner;

public class CalculaMedia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		
		System.out.println("Informe o nome do aluno: ");
		String nomeAluno = scanner.nextLine();
		System.out.println("Informe a 1 nota: ");
		double nota1 = scanner.nextDouble();
		System.out.println("Informe a 2 nota: ");
		double nota2 = scanner.nextDouble();
		System.out.println("Informe a 3 nota: ");
		double nota3 = scanner.nextDouble();
		
		double media = (nota1+nota2+nota3)/3;
				
		//System.out.println(nomeAluno + " - Situação:" + (media>=7 ? "Aprovado(a)!":"Reprovado(a)!"));
		
		if ((media>=7) && (media<=10))
			System.out.println(nomeAluno + " - Média: " + media + " - Situação:Aprovado!");
		
		else if ((media<7) && (media>=4))
			System.out.println(nomeAluno + " - Média: " + media + " - Situação:Exame.");
		
		else
			System.out.println(nomeAluno + " - Média: " + media + " - Situação:Reprovado.");
		
		
		scanner.close();
	}
}
