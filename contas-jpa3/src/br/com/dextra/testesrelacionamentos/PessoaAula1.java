package br.com.dextra.testesrelacionamentos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "SEQ_PESSOA",
sequenceName = "SEQ_PESSOA", initialValue = 1)
public class PessoaAula1 {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, 
					generator = "SEQ_PESSOA")
	private long id;
		
	@Column
	private String nome;

	@Column(nullable=true)
	private int idade;
	
	@Column(nullable=true)
	private String dataNascimento;

	@OneToOne(optional=false)
	private Endereco endereco;
	
	@ManyToOne
	private Agencia agencia;

	//cascade={CascadeType.PERSIST,CascadeType.MERGE, CascadeType.REMOVE})
	//, fetch=FetchType.EAGER
	
	@OneToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE, CascadeType.REMOVE})
	@JoinColumn(name="pessoa_fone_id")
	private List<Telefone> telefones;
	
	@ManyToMany()
	private List<PacoteServicos> pacoteServicos;
	
	
	public List<PacoteServicos> getPacoteServicos() {
		return pacoteServicos;
	}

	public void setPacoteServicos(List<PacoteServicos> pacoteServicos) {
		this.pacoteServicos = pacoteServicos;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		if (endereco == null) {
			endereco = new Endereco();
		}
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
