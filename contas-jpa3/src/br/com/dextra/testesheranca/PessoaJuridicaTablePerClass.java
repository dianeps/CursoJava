package br.com.dextra.testesheranca;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PessoaJuridicaTablePerClass extends PessoaTablePerClass {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String CNPJ;
	
	
	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
}
