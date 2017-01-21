package Threads;

public class testarDownloads {
	
	public static void main(String[] args) {
		download downloadFilme = new download("filme.avi", 20);
		download downloadMusica = new download("musica.mp3", 10);
		download downloadDocumento = new download("texto.docx", 5);
		
		BarraProgressoDownload barraFilme = new BarraProgressoDownload(downloadFilme);
		BarraProgressoDownload barraMusica = new BarraProgressoDownload(downloadMusica);
		BarraProgressoDownload barraDocumento = new BarraProgressoDownload(downloadDocumento);
		
		Thread threadBarraFilme = new Thread(barraFilme);
		Thread threadBarraMusica = new Thread(barraMusica);
		Thread threadBarraDocumento = new Thread(barraDocumento);
		
		Thread threadFilme = new Thread(downloadFilme);
		Thread threadMusica = new Thread(downloadMusica);
		Thread threadDocumento = new Thread(downloadDocumento);
		
		threadFilme.start();
		threadMusica.start();
		threadDocumento.start();		
	}
}
