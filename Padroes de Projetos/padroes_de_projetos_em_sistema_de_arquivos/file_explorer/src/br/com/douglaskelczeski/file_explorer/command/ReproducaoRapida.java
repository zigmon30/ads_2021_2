package br.com.douglaskelczeski.file_explorer.command;

public class ReproducaoRapida implements ComandoIF {
	
	private VideoReprodutor tocar;
	
	public ReproducaoRapida(VideoReprodutor tocar) {
		this.tocar = tocar;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reproduzir() {
		// TODO Auto-generated method stub
		this.tocar.rapido();
		
	}
	

}
