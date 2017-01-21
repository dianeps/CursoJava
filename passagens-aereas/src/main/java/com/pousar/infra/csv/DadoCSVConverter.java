package com.pousar.infra.csv;

/**
 * Interface que define como deve ser um conversor de objeto para CSV.
 *
 * @param <T>
 */
public interface DadoCSVConverter<T> {

    /**
     * Retorna os dados que deve estar na linha do arquivo CSV.
     *
     * @param dado
     * @return
     */
    String[] converterParaLinha(T dado);

    /**
     * Retorna um objeto a partir de uma linha no CSV.
     *
     * @param dadosLinha
     * @return
     */
    T converterParaObjeto(String[] dadosLinha);
}
