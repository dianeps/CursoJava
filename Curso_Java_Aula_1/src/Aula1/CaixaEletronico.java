package Aula1;

import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor a ser sacado: ");
		int valor = scanner.nextInt();
		
		int qtd100 = valor/100;
		valor = valor%100;		
		int qtd50 = valor/50;
		valor = valor%50;
		int qtd20 = valor/20;
		valor = valor%20;
		int qtd10 = valor/10;
		valor = valor%10;
		int qtd5 = valor/5;
		valor = valor%5;
		
		if (valor != 0) {
			System.out.println("Não é possível sacar o valor!");
		} else {
			if (qtd100 > 0){
				System.out.println(qtd100 + " nota(s) de R$100");
			}
			if (qtd50 > 0){
				System.out.println(qtd50 + " nota(s) de R$50");
			}
			if (qtd20 > 0){
				System.out.println(qtd20 + " nota(s) de R$20");
			}
			if (qtd10 > 0){
				System.out.println(qtd10 + " nota(s) de R$10");
			}
			if (qtd5 > 0){
				System.out.println(qtd5 + " nota(s) de R$5");
			}
		}
		
		scanner.close();
		
		}
}
