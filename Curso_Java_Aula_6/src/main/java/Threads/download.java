package Threads;

import java.text.MessageFormat;

public class download implements Runnable {
	private final Object monitorProgresso;
	private String nomeArquivo;
	private int tamanho;
	private int contador = 0;
	
	public download(String nomeArquivo, int tamanho){
		this.nomeArquivo = nomeArquivo;
		this.tamanho = tamanho;
		this.monitorProgresso = new Object();
	}	
	
	public void run() {
		
		while (contador < tamanho){			
			contador ++;
			synchronized (monitorProgresso){
				monitorProgresso.notifyAll();
			}			
			
			try{
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);				
			}
		}				
	}
	
	public boolean finalizado(){
		return contador == tamanho;
	}
	
	public Object getMonitorProgresso(){
		return monitorProgresso;
	}
	
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	
	public int getContador(){
		return contador;
	}
	
	public int getTamanho(){
		return tamanho;
	}
}
