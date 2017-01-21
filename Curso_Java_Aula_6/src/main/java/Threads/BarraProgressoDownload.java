package Threads;

import java.text.MessageFormat;

public class BarraProgressoDownload implements Runnable {
	private download download;	
	
	public BarraProgressoDownload(Threads.download download) {
		super();
		this.download = download;
	}

	public void run() {
		while (!download.finalizado()){
			try{
				synchronized (download.getMonitorProgresso()){
					//esperando notificação
					download.getMonitorProgresso().wait(5000);
				}		
								
				String mensagem = MessageFormat.format("Baixando {0} de {1} do arquivo {2}",download.getContador(), download.getTamanho(), download.getNomeArquivo());
				System.out.println(mensagem);
				
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}			
		}		
	}	
}
