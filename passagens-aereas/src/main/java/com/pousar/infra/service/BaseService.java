package com.pousar.infra.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.pousar.infra.csv.ArquivoCSV;

/**
 * Classe base para as classes que gerenciam os cadastros no sistema.
 *
 * @param <T>
 */
public class BaseService<T extends Entidade> {

	private ArquivoCSV<T> arquivo;
	private Map<Long, T> dados;

	public BaseService() {
		this.dados = new HashMap<Long, T>();
	}

	/**
	 * 
	 * @param arquivo
	 */
	public BaseService(ArquivoCSV<T> arquivo) {
		this();
		this.arquivo = arquivo;
		this.carregarTodosNaMemoria(arquivo.carregarTodos());
	}

	/**
	 * Carrega os registros do arquivo CSV na memoria
	 * 
	 * @param dadosNoCSV
	 */
	private void carregarTodosNaMemoria(Collection<T> dadosNoCSV) {
		for (T dadoNoCSV : dadosNoCSV) {
			dados.put(dadoNoCSV.getId(), dadoNoCSV);
		}
	}

	/**
	 * Salva o registro no mapa e no arquivo CSV
	 * 
	 * @param entidade
	 * @return
	 */
	public T salvar(T entidade) {
		Long id = entidade.getId();
		if (id == null) {
			id = System.currentTimeMillis();
			entidade.setId(id);
		}
		dados.put(id, entidade);
		if (arquivo != null) {
			arquivo.salvarTodos(dados.values());
		}
		return entidade;
	}

	/**
	 * Busca um registro pelo seu identificador
	 * 
	 * @param id
	 * @return
	 */
	public T buscarPorId(Long id) {
		return dados.get(id);
	}

	/**
	 * Remove um registro por ID
	 * 
	 * @param id
	 */
	public void remover(Long id) {
		dados.remove(id);
	}

	/**
	 * Retorna todos os registros no mapa
	 * 
	 * @return
	 */
	protected Collection<T> getTodosDados() {
		return dados.values();
	}
}