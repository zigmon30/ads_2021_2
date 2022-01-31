package br.com.douglaskelczeski.file_explorer.command;

public class ReproducaoRapida implements ComandoIF {
	
	private VideoReprodutor tocar;                          //atributo do tipo VideoReprodutor
	
	public ReproducaoRapida(VideoReprodutor tocar) {           // construtor instancia objeto da classe
		this.tocar = tocar;
	
	}

	@Override
	public void reproduzir() {
		                                               // recebe um commando da classe videoReprodutor
		this.tocar.rapido();
		
	}
	

}
