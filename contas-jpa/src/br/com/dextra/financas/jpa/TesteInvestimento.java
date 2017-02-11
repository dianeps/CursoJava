package br.com.dextra.financas.jpa;

public class TesteInvestimento {

}
/*
 * 
		TesteInvestimentoJPA.listarInvestimentosPorRendimentoValor(1000, 10);
		
		System.out.println("===========================================================");
		System.out.println("LISTANDO INVESTIMENTO POR NOME");
		
		TesteInvestimentoJPA.listarInvestimentoPorParteNome("DI");
		
		System.out.println("===========================================================");
		System.out.println("LISTANDO INVESTIMENTO POR ORDEM DESCRESCENTE");
		TesteInvestimentoJPA.listarInvestimentosDecrescente();
		
		System.out.println("===========================================================");
		System.out.println("LISTANDO INVESTIMENTO POR RENDIMENTO MENSAL");
		TesteInvestimentoJPA.listarInvestimentosPorRendimentoValor(1000,.8D);
	
				
	}
	
	public void inserirInvestimento() {
		
		// Criado novo investimento
		Investimento investimento = new Investimento();
		
		investimento.setDescricao("DI");
		investimento.setValor(2200D);
		investimento.setRendimentoMensal(8D);
	}
	
	public static void listarInvestimentosDecrescente() {
		
		// Coletando lista de investimentos ordenados por valor (decrescente)
		List<Investimento> listaInvestimentos = new ArrayList<Investimento>();
		
		listaInvestimentos = InvestimentoService.buscarOrdenadoPorValor();
		
		for(Investimento inv : listaInvestimentos) {
			System.out.println(inv.getDescricao());
			System.out.println(inv.getValor());
			System.out.println(inv.getRendimentoMensal());
		}
	}
	
	public static void listarInvestimentosPorRendimentoValor
	(double valorInvestimento,double rendimentoMensal){
		
		List<Investimento> listaInvestimentosPorRendaValor = new ArrayList<Investimento>();
		
		listaInvestimentosPorRendaValor = 
				InvestimentoService.buscarInvestimentosPorValorRendaMensal
				(valorInvestimento, rendimentoMensal);
		
		for(Investimento inv : listaInvestimentosPorRendaValor) {
			System.out.println(inv.getDescricao());
			System.out.println(inv.getValor());
			System.out.println(inv.getRendimentoMensal());
		}		
	}
	
	
	public static void listarInvestimentoPorParteNome(String parteNome) {
		
		List<Investimento> listaInvestimentosPorParteNome = new ArrayList<Investimento>();
		
		listaInvestimentosPorParteNome = InvestimentoService.buscarInvestimentoPorParteNome(parteNome);
		
		for(Investimento inv : listaInvestimentosPorParteNome) {
			System.out.println(inv.getDescricao());
			System.out.println(inv.getValor());
			System.out.println(inv.getRendimentoMensal());
		}		
	}
}
 */