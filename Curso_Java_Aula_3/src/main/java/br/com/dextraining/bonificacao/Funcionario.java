package br.com.dextraining.bonificacao;

public class Funcionario {
	private String nome;
	private double salario;
	private String cargo;
	private double porcentagemBonificacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}
	
	//SET (valor que estou passando durante a execução)
	public void setSalario(double x) {
		if (x < this.salario) {
			throw new IllegalArgumentException("Mudança inválida!");
		}
		this.salario = x;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getPorcentagemBonificacao() {
		return porcentagemBonificacao;
	}

	public void setPorcentagemBonificacao(double porcentagemBonificacao) {
		this.porcentagemBonificacao = porcentagemBonificacao;
	}

	public double valorBonificacao() {
		return (salario * (porcentagemBonificacao / 100));
	}

}
