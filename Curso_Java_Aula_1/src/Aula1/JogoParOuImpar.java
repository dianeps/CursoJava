package Aula1;

import java.util.Scanner;

public class JogoParOuImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String jogadorPar = scanner.nextLine();
		String jogadorÍmpar = scanner.nextLine();
		
		int jogadaPar = scanner.nextInt();
		int jogadaÍmpar = scanner.nextInt();
		
		int soma = jogadaPar + jogadaÍmpar;
		
		boolean par = (soma%2) == 0;
		
		String vencedor = par ? jogadorPar:jogadorÍmpar;
		
		System.out.println("O resultado do jogo foi: " + soma);
		System.out.println("O jogador " + vencedor + " venceu!");
		
		scanner.close();
	}
}
