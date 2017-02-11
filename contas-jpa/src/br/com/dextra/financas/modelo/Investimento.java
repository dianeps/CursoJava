package br.com.dextra.financas.modelo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

//@Embeddable
@Entity
@SequenceGenerator(name = "SEQ_PINVEST", 
sequenceName = "SEQ_PINVEST", initialValue = 1)

public class Investimento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, 
	generator = "SEQ_PINVEST")
		
	private Integer id_investimento;

	//@Column(length = 200, nullable = false)
	private String descricao;

	//@Column(precision = 10, scale = 10, nullable = false)
	private Double valor;

	//@Column(precision = 10, scale = 10, nullable = false)
	private Double rendimentoMensal;
	
	
	@ManyToOne()
	private PessoaInvestimento pessoaInvestimento;
	
	public PessoaInvestimento getPessoaInvestimento() {
		return pessoaInvestimento;
	}

	public void setPessoaInvestimento(PessoaInvestimento pessoaInvestimento) {
		this.pessoaInvestimento = pessoaInvestimento;
	}
	
	public Integer getId() {
		return id_investimento;
	}

	public void setId(Integer id) {
		this.id_investimento = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getRendimentoMensal() {
		return rendimentoMensal;
	}

	public void setRendimentoMensal(Double rendimentoMensal) {
		this.rendimentoMensal = rendimentoMensal;
	}
}

