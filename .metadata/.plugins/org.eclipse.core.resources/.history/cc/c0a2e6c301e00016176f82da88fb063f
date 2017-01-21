package com.pousar.domain.usuario;

import java.util.ArrayList;
import java.util.List;

import com.pousar.domain.common.ValidacaoException;
import com.pousar.infra.csv.ArquivoCSV;
import com.pousar.infra.service.BaseService;
import com.pousar.infra.util.Strings;

/**
 * Servico para manipular usuarios do sistema.
 */
public class UsuarioService extends BaseService<Usuario> {

	/**
	 * Caminho para o arquivo que contem usuarios.
	 */
	public static final String CAMINHO_ARQUIVO = System
			.getProperty("user.home") + "/usuarios.csv";

	public UsuarioService() {
		super(new ArquivoCSV<>(CAMINHO_ARQUIVO, new UsuarioToCSVConverter()));
	}

	/**
	 * Cria/atualiza um usuario
	 */
	@Override
	public Usuario salvar(Usuario usuario) {
		if (Strings.isEmpty(usuario.getNome())) {
			throw new ValidacaoException("Nome eh obrigatorio");
		}
		if (Strings.isEmpty(usuario.getEmail())) {
			throw new ValidacaoException("Email eh obrigatorio");
		}
		if (Strings.isEmpty(usuario.getSenha())) {
			// TODO: Faca o lancamento da excecao como no exemplo acima.
		}
		// TODO: validar duplicidade de email do usuario

		// Dica: Usar o buscarPorEmail para buscar o usuario com o email
		// informado.

		// Dica: O salvar tambem esta sendo usado para alteracao de usuario
		// existente. Verifique se o usuario encontrado com o mesmo email nao eh
		// o proprio usuario.
		return super.salvar(usuario);
	}

	/**
	 * Busca um usuario por email e senha
	 * 
	 * @param email
	 * @param senha
	 * @return
	 */
	public Usuario buscarParaLogin(String email, String senha) {
		Usuario usuario = buscarPorEmail(email);
		if (usuario != null && usuario.getSenha().equals(senha)) {
			return usuario;
		}
		return null;
	}

	/**
	 * Busca um usuario por email.
	 * 
	 * @param email
	 * @return
	 */
	public Usuario buscarPorEmail(String email) {
		for (Usuario usuario : getTodosDados()) {
			if (usuario.getEmail().trim().equalsIgnoreCase(email.trim())) {
				return usuario;
			}
		}
		return null;
	}

	public List<Usuario> buscarPor(String email, String nome) {
		List<Usuario> resultados = new ArrayList<>(getTodosDados());
		// TODO: Filtar usuarios pelo email recebido
		// TODO: Filtrar usuarios pelo nome recebido
		// TODO: Ordenar por email, nome

		// Dica: Usar a classe auxiliar Strings para verificar se o parametro
		// esta vazio. Ver metodo "salvar"
		return resultados;
	}
}
