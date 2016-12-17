package br.com.dextraining.usuario;

import org.junit.Assert;
import org.junit.Test;

public class UsuarioTest {
	
	@Test
	public void testarComSenhaValida(){
		String senhaValida = "123456789a";
		
		Usuario usuario = new Usuario();
		usuario.setNome("Fulano");
		usuario.setEmail("fulano@gmail.com");
		usuario.setSenha(senhaValida);
		
		Assert.assertEquals(senhaValida, usuario.getSenha());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testarComSenhaInvalida(){
		String senhaValida = "123456789a";
		
		Usuario usuario = new Usuario();
		usuario.setNome("Fulano");
		usuario.setEmail("fulano@gmail.com");
		usuario.setSenha(senhaValida);
		
		Assert.assertEquals(senhaValida, usuario.getSenha());
	}
	
}
