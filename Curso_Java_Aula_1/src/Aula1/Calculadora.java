package Aula1;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o 1 numero:");
		double numero = scanner.nextDouble();
				
		System.out.println("Informe o 2 numero:");
		double numero2 = scanner.nextDouble();
				
		System.out.println(numero + " + " + numero2 + " = " + (numero+numero2));
		System.out.println(numero + " - " + numero2 + " = " + (numero-numero2));
		System.out.println(numero + " * " + numero2 + " = " + (numero*numero2));
		System.out.println(numero + " / " + numero2 + " = " + (numero/numero2));
		System.out.println(numero + " % " + numero2 + " = " + (numero%numero2));
		
		scanner.close();
	}
}
