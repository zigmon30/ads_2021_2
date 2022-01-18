package br.com.douglaskelczeski.file_explorer.proxy;

public class VideoProxy implements VideoReprodutor{
	
	private Video nomeVideo;
	private String nomeArquivo;
	
	
	public VideoProxy(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		
	}

	@Override
	public void reprodutor() {
		// reproduz metodos da classe video que ficara escondido

		nomeVideo = new Video(nomeArquivo);
		nomeVideo.reprodutor();
		
	}

}
