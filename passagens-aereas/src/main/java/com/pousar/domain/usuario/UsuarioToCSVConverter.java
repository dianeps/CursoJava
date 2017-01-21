package com.pousar.domain.usuario;

import com.pousar.infra.csv.DadoCSVConverter;

/**
 * Conversor de usuario para linha de arquivo CSV.
 * 
 * @author java03
 *
 */
public class UsuarioToCSVConverter implements DadoCSVConverter<Usuario> {

	@Override
	public String[] converterParaLinha(Usuario usuario) {
		return new String[] { 
				usuario.getId().toString(),
				usuario.getNome().toString(), 
				usuario.getEmail().toString(),
				usuario.getSenha().toString() 
		};
	}

	@Override
	public Usuario converterParaObjeto(String[] dadosLinha) {
		Usuario usuario = new Usuario();
		usuario.setId(Long.valueOf(dadosLinha[0]));
		usuario.setNome(dadosLinha[1]);
		usuario.setEmail(dadosLinha[2]);
		usuario.setSenha(dadosLinha[3]);

		return usuario;
	}
}
