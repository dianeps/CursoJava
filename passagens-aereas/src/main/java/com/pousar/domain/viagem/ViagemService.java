package com.pousar.domain.viagem;

import com.pousar.domain.common.ValidacaoException;
import com.pousar.infra.service.BaseService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViagemService extends BaseService<Viagem> {

    @Override
    public Viagem salvar(Viagem entidade) {
        // TODO: Implementar validacoes e salvar no banco de dados.
        throw new ValidacaoException("Ainda nao implementado");
    }

    public List<Viagem> buscarPor(String origem, String destino, Date dataSaida, Date dataVolta) {
    /**
     * TODO: Metodo que deve buscar uma viagem por origem, destino e datas.
     */
    	
        return new ArrayList<>();
    }
}