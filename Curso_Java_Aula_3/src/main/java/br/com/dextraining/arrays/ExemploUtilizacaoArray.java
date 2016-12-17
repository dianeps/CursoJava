package br.com.dextraining.arrays;

public class ExemploUtilizacaoArray {
	public static void main(String[] args){
		int tamanho = 5;
		int valores[]= new int [tamanho];
		int outrosValores[]= {1,2,3,4,5};
		String nomes []=new String[tamanho];
		
		System.out.println("Conteudo de valores");
		for (int i = 0; i < tamanho; i++){
			int valor = outrosValores[i];
			System.out.println("[ " + i + " ] = " + valor);
		}
		
		System.out.println("Conteudo de outrosValores");
		for (int i = 0; i < tamanho; i++){
			int valor = outrosValores[i];
			System.out.println("[ " + i + " ] = " + outrosValores);
		}
	}
}
