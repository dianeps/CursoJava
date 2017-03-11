package br.com.dextra.financas.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

//@Entity
@SequenceGenerator(name = "SEQ_PESSERVICE", 
sequenceName = "SEQ_PESSERVICE", initialValue = 1)
public class PessoaPacoteservicos {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, 
	generator = "SEQ_PESSERVICE")
	private long idPessoaServico;
	
	public long getIdPessoaServico() {
		return idPessoaServico;
	}

	public void setIdPessoaServico(long idPessoaServico) {
		this.idPessoaServico = idPessoaServico;
	}

	@ManyToOne
	private Pessoa pessoa;
	
	@ManyToOne 
	private PacoteServicos pacoteServicos;
	
	private Date dataContratacao;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public PacoteServicos getPacoteServicos() {
		return pacoteServicos;
	}

	public void setPacoteServicos(PacoteServicos pacoteServicos) {
		this.pacoteServicos = pacoteServicos;
	}

	public Date getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
}
