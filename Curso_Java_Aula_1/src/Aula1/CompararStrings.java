package Aula1;

import java.util.Scanner;

public class CompararStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o 1 nome:");
		String nome = scanner.nextLine();
		System.out.println("Digite o 2 nome:");
		String nome2 = scanner.nextLine();
		
		System.out.println("É igual:" + (nome.equals(nome2)));
		//System.out.println("É igual:" + (nome.equalsIgnoreCase(nome2)));  Ignora se é maiusculo ou minusculo
		
		scanner.close();
	}
}
