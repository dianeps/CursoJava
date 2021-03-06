package br.com.dextra.testesrelacionamentos;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import common.domain.BaseEntity;


@Entity
@SequenceGenerator(name = "SEQ_ENDERECO", 
				sequenceName = "SEQ_ENDERECO", initialValue = 1)
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, 
					generator = "SEQ_ENDERECO")
	private long id;
	
	@Enumerated(EnumType.STRING)
	private UF estado;
	
	private String cidade;
	
	private String logradouro;

	public UF getEstado() {
		return estado;
	}

	public void setEstado(UF estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

}
