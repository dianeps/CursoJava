package br.com.dextraining.garagem;

import java.util.Scanner;

public class InterfaceGaragem {
	private static int mostrarMenu(Scanner scanner) {
		System.out.println("1. Cadastrar");
		System.out.println("2. Vender (por placa)");
		System.out.println("3. Buscar (por placa)");
		System.out.println("4. Listar");
		System.out.println("5. Sair");
		return scanner.nextInt();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = mostrarMenu(scanner);
				
		while (opcao != 5) {
			if (opcao == 1) {
				//marca, modelo, placa, ano e preço
				System.out.println("Informe a marca do carro:");
				scanner.nextLine();
				System.out.println("Informe o modelo do carro:");
				System.out.println("Informe a placa do carro:");
				System.out.println("Informe o ano do carro:");
				System.out.println("Informe o preco do carro:");
				
				
			} else if (opcao == 2) {				
				System.out.println("Informe a placa do carro:");
				
			} else if (opcao == 3) {
				System.out.println("Informe a placa do carro:");
				
			} else if (opcao == 4) {
					System.out.println("Lista");
					
			} else {
				System.out.println("Opcao invalida!");
			}
			opcao = mostrarMenu(scanner);
		}
		scanner.close();
		
	}
}
