package br.com.douglaskelczeski.file_explorer.singleton;

public class VideoProxy implements VideoReprodutor{
	
	private Video nomeVideo;
	private String nomeArquivo;
	
	
	public VideoProxy(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		
	}

	@Override
	public void reprodutor() {
		// TODO Auto-generated method stub
		if(nomeVideo == null) {
			System.out.println("objeto ainda não instaciado...Criando uma instancia para Video...");
			nomeVideo = new Video(nomeArquivo);
		} else {
			System.out.println("recuperando instacia de video...");
		}
		
		nomeVideo.reprodutor();
		
	}

}
