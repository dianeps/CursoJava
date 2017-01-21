package com.pousar.infra.csv;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Salva e le registros de um arquivo CSV.
 *
 * @param <T>
 */
public class ArquivoCSV<T> {

	/**
	 * Caminha para acessar o arquivo.
	 */
	private String caminhoArquivo;
	/**
	 * Conversor que: -> Transforma o objeto em "linha" do CSV; -> Transforma a
	 * "linha" do CSC em objeto.
	 */
	private final DadoCSVConverter<T> conveter;

	public ArquivoCSV(String caminhoArquivo, DadoCSVConverter<T> conveter) {
		this.caminhoArquivo = caminhoArquivo;
		this.conveter = conveter;
		this.criarArquivo(caminhoArquivo);
	}

	/**
	 * Salva a lista de registros no arquivo CSV.
	 *
	 * @param dados
	 */
	public void salvarTodos(Collection<T> dados) {
		FileWriter fileWriter = criarWriter();

		try {
			for (T dado : dados) {
				String[] valores = conveter.converterParaLinha(dado);
				fileWriter.write(String.join(";", valores) + "\n");
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			fechar(fileWriter);
		}
	}

	/**
	 * Carrega todos os registros presentes no arquivo usando o arquivo CSV.
	 *
	 * @return
	 */
	public Collection<T> carregarTodos() {
		List<T> dados = new ArrayList<T>();

		BufferedReader reader = criarReader();
		try {
			String linha = null;
			while ((linha = reader.readLine()) != null) {
				String[] valores = linha.split(";");
				T dado = conveter.converterParaObjeto(valores);
				dados.add(dado);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			fechar(reader);
		}
		return dados;
	}

	/**
	 * Cria o writer para escrever no arquivo
	 *
	 * @return
	 */
	private FileWriter criarWriter() {
		try {
			return new FileWriter(caminhoArquivo);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Cria o reader para ler do arquivo
	 *
	 * @return
	 */
	private BufferedReader criarReader() {
		try {
			return new BufferedReader(new FileReader(caminhoArquivo));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Metodo responsavel por fechar o reader/writter
	 *
	 * @param closeable
	 */
	private void fechar(Closeable closeable) {
		try {
			closeable.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Cria o arquivo no disco caso ele nao exista.
	 * 
	 * @param caminhoArquivo
	 */
	private void criarArquivo(String caminhoArquivo) {
		try {
			File file = new File(caminhoArquivo);
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
