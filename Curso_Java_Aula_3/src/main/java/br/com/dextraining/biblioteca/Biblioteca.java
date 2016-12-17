package br.com.dextraining.biblioteca;

public class Biblioteca {	
	public Livro livros[] = new Livro[100];
	public int indiceCod;
	
	//nao funciona
	public int BuscarLivro(String codigo){
		for (indiceCod = 0; indiceCod < 100; indiceCod++){
			if(codigo != livros[indiceCod].getCodigo()){
				return indiceCod;
			}
		}
		return indiceCod;
	}
	
	public boolean AdicionarLivro(String codigo){
		
	}
}
