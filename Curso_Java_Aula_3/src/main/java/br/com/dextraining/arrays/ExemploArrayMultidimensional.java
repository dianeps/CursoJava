package br.com.dextraining.arrays;

public class ExemploArrayMultidimensional {
	public static void main(String[] args) {
		int valores[][] = new int [3][3];
		int outrosValores[][] = new int [3][];
		outrosValores[0] = new int[1];
		outrosValores[1] = new int[3];
		outrosValores[2] = new int[5];
		
		valores[0][1] = 10;
		valores[1][2] = 11;
		
		for(int linha = 0; linha < 3; linha++){
			for(int coluna = 0; coluna < 3; coluna++){
				System.out.print("[" + linha + "]" + "[" + coluna + "]");
				System.out.println(valores[linha][coluna]);
			}
		}
		
		for(int linha = 0; linha < outrosValores.length; linha++){
			for(int coluna = 0; coluna < outrosValores[linha].length; coluna++){
				System.out.print("[" + linha + "]" + "[" + coluna + "]");
				System.out.println(outrosValores[linha][coluna]);
			}
		}
		
	}
}
