package br.com.dextraining.garagem;

import java.util.HashMap;
import java.util.Map;

public class Garagem {

	private Map<String, Carro> carros;
	
	public Garagem(){
		this.carros = new HashMap<String, Carro>();
	}
	
	public boolean adicionarCarro(Carro carro){
		//tipo variável = metodo(classe) (array.metodo do tipo());
		Carro carroEncontrado = buscarCarro(carro.getPlaca());
		
		return false;
		/*
		Livro livroEncontrado = buscar(livro.getCodigo());
		if (livroEncontrado != null) {
			return false;
		}
		livros[quantidadeLivros++] = livro;
		return true;
		*/
	}
	
	public boolean venderCarro(String placa){
		return false;
	}
	
	public Carro buscarCarro(String placa){
		
		return null;
	}
	
	//listar
	/*public Collection<Carro> getCarros(){
	  
	 }*/
	
}
