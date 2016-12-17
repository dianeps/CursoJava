package Aula1;

import java.util.Scanner;

public class NumeroOrdemCrescente {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o 1 numero:");
		int num1 = scanner.nextInt();
		
		System.out.println("Informe o 2 numero:");
		int num2 = scanner.nextInt();
		
		System.out.println("Informe o 3 numero:");
		int num3 = scanner.nextInt();
		
		int maior = 0, menor = 0;
		
		if (num1 > num2){
			maior = num1;
			menor = num2;
		} else {
			maior = num2;
			menor = num1;
		}
		if (num3 >= maior){
			System.out.println(num3 + " " + maior + " " + menor);
		} else if (num3 >= maior){
			System.out.println(maior + " " + num3 + " " + menor);
		} else {
			System.out.println(maior + " " + menor + " " + num3);
		}
		
		scanner.close();
	}
}
