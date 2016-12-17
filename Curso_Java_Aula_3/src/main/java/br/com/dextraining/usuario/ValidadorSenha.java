package br.com.dextraining.usuario;

public class ValidadorSenha {
	public static boolean Validar(String senha){
		if(senha.length() < 5){
			return false;
		}
		
		return contemLetra(senha);// && contemNumero(senha);
	}
	
	public static boolean contemLetra(String senha){
		for(char caractere:senha.toCharArray()){
			if (Character.isLetter(caractere)){
				return true;
			}
		}
		return false;
	}
	
}
