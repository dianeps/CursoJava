package br.com.dextra.financas.jpa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.banco.service.AgenciaService;
import br.com.banco.service.EnderecoService;
import br.com.banco.service.PacoteServicoService;
import br.com.banco.service.PessoaService;
import br.com.banco.service.PessoaServiceAula1;
import br.com.banco.service.TelefoneService;
import br.com.dextra.financas.modelo.Agencia;
import br.com.dextra.financas.modelo.Endereco;
import br.com.dextra.financas.modelo.PacoteServicos;
import br.com.dextra.financas.modelo.Pessoa;
import br.com.dextra.financas.modelo.PessoaAula1;
import br.com.dextra.financas.modelo.Telefone;
import br.com.dextra.financas.modelo.UF;

public class TestePersistenciaPessoaAula1 {
	
	public static void main(String[] args) {
		
		/**
		 * Setando e Persistindo endereco
		 */
		
		Endereco enderecoJoazinho = new Endereco();
		
		enderecoJoazinho.setCidade("Campinas");
		enderecoJoazinho.setEstado(UF.SP);
		enderecoJoazinho.setLogradouro("Rua 10, 342");
		
		Endereco enderecoMariazinha = new Endereco();
		
		enderecoMariazinha.setCidade("Saquarema");
		enderecoMariazinha.setEstado(UF.RJ);
		enderecoMariazinha.setLogradouro("Rua da Praia, 223");
		
		EnderecoService.inserir(enderecoJoazinho);
		EnderecoService.inserir(enderecoMariazinha);
		
		
		/**
		 * Setando e persistindo Agencia
		 */
		
		Agencia agencia = new Agencia();
		agencia.setCidade("Sao paulo");
		agencia.setEstado(UF.SP);
		agencia.setLogradouro("AV. Paulita, 442");
		
		AgenciaService.inserir(agencia);
		
		/**
		 * Setando e persistindo Telefones
		 */
		
		Telefone fone1 = new Telefone();
		Telefone fone2 = new Telefone();
		Telefone fone3 = new Telefone();
		Telefone fone4 = new Telefone();
		
		fone1.setDDD("11");
		fone1.setTelefone("3222-7723");
		
		fone2.setDDD("19");
		fone2.setTelefone("3461-1212");
		
		fone3.setDDD("43");
		fone3.setTelefone("3334-2093");
		
		fone4.setDDD("12");
		fone4.setTelefone("2323-3443");
		
		/*
		TelefoneService.inserir(fone1);
		TelefoneService.inserir(fone2);
		TelefoneService.inserir(fone3);
		TelefoneService.inserir(fone4);
		*/
		
		List<Telefone> fonesJoazinho = new ArrayList<Telefone>();
		fonesJoazinho.add(fone1);
		fonesJoazinho.add(fone2);
		
		List<Telefone> fonesMariazinha = new ArrayList<Telefone>();
		fonesMariazinha.add(fone3);
		fonesMariazinha.add(fone4);
	
		
		PacoteServicos pc1 = new PacoteServicos();
		PacoteServicos pc2 = new PacoteServicos();
		
		pc1.setNome("Pacote b�sico");
		pc1.setValor(155D);
		pc1.setDataContratacao(new Date());
		
		pc2.setNome("Pacote Plus");
		pc2.setValor(247D);
		pc2.setDataContratacao(new Date());
		
		PacoteServicoService.inserir(pc1);
		PacoteServicoService.inserir(pc2);
		
		List<PacoteServicos> pacotesJoazinho = new ArrayList<PacoteServicos>();
		pacotesJoazinho.add(pc1);
		
		List<PacoteServicos> pacoteMarizinha = new ArrayList<PacoteServicos>();
		pacoteMarizinha.add(pc2);
		
	
		PessoaAula1 joao = new PessoaAula1();
		PessoaAula1 maria = new PessoaAula1();

		
		// Setando valores
		joao.setNome("Joazinho");
		joao.setIdade(100);
		joao.setDataNascimento("1950-01-01");
		joao.setEndereco(enderecoJoazinho);
		joao.setAgencia(agencia);
		joao.setTelefones(fonesJoazinho);
		joao.setPacoteServicos(pacotesJoazinho);
		
		
		maria.setNome("Mariazinha");
		maria.setIdade(100);
		maria.setDataNascimento("1950-01-01");
		maria.setEndereco(enderecoMariazinha);
		maria.setAgencia(agencia);
		maria.setTelefones(fonesMariazinha);
		maria.setPacoteServicos(pacoteMarizinha);
		
		
		/**
		 * Persistindo dados
		 */
		PessoaServiceAula1.inserir(joao);
		PessoaServiceAula1.inserir(maria);
		
		
		/**
		 * Buscando dados
		 */
		//bucaPessoaPorId(2L);
		listaPessoas();
		listaPessoasPorEstado(UF.SP);
		listaAgenciaPessoasPorEstado(UF.SP);
		listaPessoasQuePossuemDeterminadoPacoteInformado("Pacote b�sico");
	}

	public static void bucaPessoaPorId(Long id) {
		PessoaAula1 p1 = new PessoaServiceAula1().buscarPorId(id);
		
		System.out.println("----------------- LISTANDO DADOS POR ID -------------------");
		System.out.println("ID...: " + p1.getId());
		System.out.println("Nome..:" + p1.getNome());
		System.out.println("-----------------------------------------------------------");
	}
	
	public static void listaPessoas() {
		
		System.out.println("---------------- Listando pessoas --------------");
		
		List nomesDasPessoas = PessoaServiceAula1.buscaTodasPessoas();
		
		for (Object nomes : nomesDasPessoas) {
			PessoaAula1 p = (PessoaAula1) nomes;			
			System.out.println(p.getNome());
		}		
		System.out.println("-------------------------------------------------------------------------------");
	}
	
	public static void listaPessoasPorEstado(UF uf){	
		
		List<PessoaAula1> listaPessoasPorEstadoInformado = 
				new ArrayList<PessoaAula1>();
		
		listaPessoasPorEstadoInformado = PessoaServiceAula1.
				buscarPorEstado(uf);
		
		System.out.println("---------------- Listando pessoas do estado: " + uf + " --------------");
		
		for (PessoaAula1 p : listaPessoasPorEstadoInformado) {
			
			System.out.println(p.getNome() + " - " + 
			p.getEndereco().getCidade() + " - " + 
					p.getEndereco().getEstado());
			
		}
		
		System.out.println("----------------------------------------------------------------------");
		
	}
	
	public static void listaAgenciaPessoasPorEstado(UF uf) {
		
		List<PessoaAula1> listaagenciapessoasporestado = new ArrayList<PessoaAula1>();
		listaagenciapessoasporestado = PessoaServiceAula1.listaAgenciasPessoasPorEstado(uf);
		
		System.out.println("--- Listando pessoas da agencia: " + uf );
		for (PessoaAula1 p : listaagenciapessoasporestado) {
			System.out.println(p.getNome());
			System.out.println(p.getAgencia().getCidade());
			System.out.println(p.getAgencia().getEstado());
			System.out.println(p.getAgencia().getLogradouro());
		}	
	}
	
	public static void listaPessoasQuePossuemDeterminadoPacoteInformado(String nomePacote){
		List<PessoaAula1> listaPessoaPorNomePacote = new ArrayList<PessoaAula1>();
		listaPessoaPorNomePacote = PessoaServiceAula1.listaPessoasDoPacoteInformado(nomePacote);
		
		System.out.println("----- Listando Pessoas com Pacote: " + nomePacote);
		for (PessoaAula1 p :listaPessoaPorNomePacote) {
			System.out.println(p.getNome());
			for (PacoteServicos pacote : p.getPacoteServicos()) {
				System.out.println(pacote.getNome());
				System.out.println(pacote.getValor());
			}
		}
	}

	
}
