package br.com.dextraining.Usuario;

import br.com.dextraining.exceptions.ErroValidacaoException;

public class TestarUsuario {
	public static void main(String[] args) throws Exception {
		
		GerenciadorUsuario gerenciador = new GerenciadorUsuario();
		
		Usuario usuario = new Usuario(null,null,null);
		
		try {
			
		} catch ()
		/*try {
			gerenciador.adicionar(usuario);
			System.out.println("Usuario adicionado com sucesso!");
		} catch (Exception e){
			System.out.println("Erro: " + e.getMessage());
		} finally {
			System.out.println("Liberando recursos.");
		}
		
		/* segunda opção de catch
		catch (ErroValidacaoException e) { //runtime
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e){
			System.out.println("Segundo catch");
		}
		*/
		
		
	}
}
