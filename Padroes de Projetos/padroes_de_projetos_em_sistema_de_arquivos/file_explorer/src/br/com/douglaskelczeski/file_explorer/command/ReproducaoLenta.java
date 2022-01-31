package br.com.douglaskelczeski.file_explorer.command;

public class ReproducaoLenta implements ComandoIF {
	
	private VideoReprodutor tocar;
	
	public ReproducaoLenta(VideoReprodutor tocar) {
		this.tocar = tocar;
	
	}

	@Override
	public void reproduzir() {
		this.tocar.lenta();
		
	}
	

}
