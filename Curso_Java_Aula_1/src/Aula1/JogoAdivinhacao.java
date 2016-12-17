package Aula1;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero = new Random().nextInt(10) + 1;
		
		int i = 1, chute = 0;
		
		do {
			System.out.println("Chute um número: ");
			chute = scanner.nextInt();
			
			if (chute == numero){
				System.out.println("Você acertou em " + i + " tentativas!");
				break;
			} else {
				System.out.println("Chute errado, tente novamente!");
			}
			
			i ++;
			
		} while (chute != numero);
		
		scanner.close();
	}
}
