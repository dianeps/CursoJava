package br.com.dextra.service;

import java.util.List;

import javax.persistence.TypedQuery;

import br.com.dextra.testesrelacionamentos.PessoaAula1;
import br.com.dextra.testesrelacionamentos.UF;



public class PessoaServiceAula1 {
	
	
	/**
	 * Metodo padrao do EntityManager para persistir dados
	 * @param p
	 * @return
	 */
	public static PessoaAula1 inserir(PessoaAula1 p) {
		EntityManagerUtil.begin();
		EntityManagerUtil.getEM().persist(p);
		EntityManagerUtil.commit();
		return p;
	}

	/**
	 * Metodo padrao do EntityManager que retorna registro pela chave primaria
	 * @param id
	 * @return
	 */
	public static PessoaAula1 buscarPorId(Long id) {
		return EntityManagerUtil.
				getEM().find(PessoaAula1.class, id);
	}
	
	public static List<PessoaAula1> buscaTodasPessoas() {
		String jpql = "SELECT p FROM " + PessoaAula1.class.getSimpleName() + " p";
		
		TypedQuery<PessoaAula1> qry = 
		EntityManagerUtil.getEM().
		createQuery(jpql, PessoaAula1.class);
		return qry.getResultList();
	}

	public static List<PessoaAula1> buscarPorEstado(UF uf) {
		String jpql = "SELECT p FROM " 
				+ PessoaAula1.class.getSimpleName() + " p"
				+ " WHERE p.endereco.estado = :uf";

		TypedQuery<PessoaAula1> qry = 
				EntityManagerUtil.getEM().createQuery(jpql, PessoaAula1.class);
		qry.setParameter("uf", uf);

		return qry.getResultList();
	}
	
	public static List<PessoaAula1> listaAgenciasPessoasPorEstado(UF uf) {
		String jpql = "";
		jpql += "SELECT p FROM "
				+ PessoaAula1.class.getSimpleName() + " p";
		jpql += " WHERE p.agencia.estado = :uf";

		TypedQuery<PessoaAula1> qry = EntityManagerUtil.getEM().createQuery(jpql, PessoaAula1.class);
		qry.setParameter("uf", uf);

		return qry.getResultList();
	}
	
	public static List<PessoaAula1> listaPessoasDoPacoteInformado(String nomePacote) {
		String jpql = "";
		jpql += "SELECT p FROM PessoaAula1 p";
		jpql += " INNER JOIN p.pacoteServicos pacoteServicos ";
		jpql += " WHERE pacoteServicos.nome = :nomePacote";

		TypedQuery<PessoaAula1> query = EntityManagerUtil.getEM().createQuery(jpql, PessoaAula1.class);
		query.setParameter("nomePacote",nomePacote);

		return query.getResultList();
	}
	
}
