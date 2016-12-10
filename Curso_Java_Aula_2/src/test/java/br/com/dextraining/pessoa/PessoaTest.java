package br.com.dextraining.pessoa;

import java.util.Scanner;

public class PessoaTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		
		System.out.println("Informe o nome da pessoa: ");
		String nome = scanner.nextLine();
		
		System.out.println("Informe o cpf da pessoa: ");
		String cpf = scanner.nextLine();
		
		System.out.println("Informe o rg da pessoa: ");
		String rg = scanner.nextLine();
		
		Pessoa pessoa = new Pessoa(nome, cpf, rg);
		
		System.out.println(pessoa);
		
		scanner.close();
	}
}
