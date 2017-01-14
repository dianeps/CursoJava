package br.com.dextraining.collections;

import java.util.Scanner;

public class interfaceSenha {
	private static int mostrarMenu(Scanner scanner) {
		System.out.println("1. Gerar senha padrão");
		System.out.println("2. Gerar senha idoso");
		System.out.println("3. Próxima senha");		
		System.out.println("4. Sair");
		return scanner.nextInt();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = mostrarMenu(scanner);
		
		geradorSenha geradorSenha = new 
		while (opcao != 4) {
			if (opcao == 1) {
				
				String senha = geradorSenha.
				//senha padrao
				
			} else if (opcao == 2) {				
				//senha idoso
				
			} else if (opcao == 3) {
				//proxima senha
				
			} else {
				System.out.println("Opcao invalida!");
			}
			opcao = mostrarMenu(scanner);
		}
		scanner.close();
		
	}
}
