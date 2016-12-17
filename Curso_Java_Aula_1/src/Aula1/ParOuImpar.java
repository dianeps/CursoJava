package Aula1;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um numero inteiro:");
		int numero = scanner.nextInt();

		System.out.println((numero%2)==0?"É par!":"É ímpar!");
		
		scanner.close();
	}
}
