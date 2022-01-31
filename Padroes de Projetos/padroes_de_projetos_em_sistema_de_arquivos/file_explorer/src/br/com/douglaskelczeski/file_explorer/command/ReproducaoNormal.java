package br.com.douglaskelczeski.file_explorer.command;

public class ReproducaoNormal implements ComandoIF {
	
	private VideoReprodutor tocar;
	
	public ReproducaoNormal(VideoReprodutor tocar) {        // construtor
		this.tocar = tocar;
	  
	}

	public void reproduzir() {
		// TODO Auto-generated method stub                      //reproduz velocidade normal
		this.tocar.normal();
		
	}
	

}
