package Aula1;

import java.util.Scanner;

public class SaldoDeGols {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nome do 1 time:");
		String timeA = scanner.nextLine();
		
		System.out.println("Nome do 2 time:");
		String timeB = scanner.nextLine();
		
		System.out.println("Quantos jogos?");
		int numJogos = scanner.nextInt();
		
		int i = 0, vitoriaA = 0, vitoriaB = 0, empate = 0, golsA = 0, golsB = 0;
		
		while (i <= numJogos) {
			System.out.println("Resultado do time A no " + i + " jogo:");
			int resultA = scanner.nextInt();			
			System.out.println("Resultado do time B no " + i + " jogo:");
			int resultB = scanner.nextInt();
			
			if (resultA > resultB) {
				vitoriaA ++;				
			} else if (resultB > resultA){
				vitoriaB ++;
			} else {
				empate ++;
			}
			
			golsA = golsA + resultA;
			golsB = golsB + resultB;
			i ++;
		}
		
		System.out.println("O time " + timeA + " fez " + golsA + " gol(s) no total.");
		System.out.println("Sofreu " + golsB + " gol(s).");
		System.out.println("venceu " + vitoriaA + " jogo(s).");
		
		System.out.println("O time " + timeB + " fez " + golsB + " gol(s) no total.");
		System.out.println("Sofreu " + golsA + " gol(s)");
		System.out.println("venceu " + vitoriaB + " jogo(s).");
		
		if (vitoriaA > vitoriaB){
			System.out.println("O time " + timeA + " venceu mais jogos.");
		} else if (vitoriaB > vitoriaA){
			System.out.println("O time " + timeB + " venceu mais jogos.");
		} else {
			System.out.println("Os times empataram na quantidade de vitórias.");
		}
		scanner.close();
	}
}
