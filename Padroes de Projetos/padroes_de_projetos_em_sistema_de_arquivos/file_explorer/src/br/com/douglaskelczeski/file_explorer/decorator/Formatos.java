package br.com.douglaskelczeski.file_explorer.decorator;

public abstract class Formatos {
	
	protected Formatos outroFormato;

	
	
	//construtor padrão
	public Formatos() {
		
	}
	public Formatos(Formatos outroFormato) {
		this.outroFormato = outroFormato;
		
	}
	
	public abstract double calculaTamanho(Video video);
	
	protected double calcula(Video video) {
		if(outroFormato == null)
			return 0;
		else
			return outroFormato.calculaTamanho(video);
		
	}
	

}
