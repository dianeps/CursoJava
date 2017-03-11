package br.com.dextra.testesrelacionamentos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "SEQ_PESSOA",
sequenceName = "SEQ_PESSOA", initialValue = 1)
public class PessoaEndereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, 
	generator = "SEQ_PESSOA")
	private int Id;
	
	private String nome;
	
	@OneToOne
	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
