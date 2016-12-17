package Aula1;

public class ExDeclaracaoDeVariaveis {
	public static void main(String[] args) {
		float pontoFlutuante = 1.5f; //sem o f no fim do valor, o Java considera como double
		
		//String não é um tipo primitivo, é uma classe. Nunca muda
		
		String minhaString = "Curso Java";
		
		
		// Exercicio:
		
		int valorInteiro = 1000;
		//byte valorByte = 1000; errado, valor esta fora do limite de byte
		double valorDouble = 0.856;
		char primeiroChar = 'P';
		char segundoChar = 30; //caracter que esta na posição 30 da tabela de caracteres do Java
		
		//char terceiroChar = 'Meu Caractere'; errado, char nao aceita toda essa cadeia de caracteres
		String meuNome = "Diane";
		
		System.out.println(segundoChar);
	}
}
