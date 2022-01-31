package br.com.douglaskelczeski.file_explorer.decorator;

public class FullHd extends Formatos {
	
	
	//construtores
	public FullHd() {
		super();
	
	}

	public FullHd(Formatos outroFormato) {
		super(outroFormato);
	
	}

	@Override
	public double calculaTamanho(Video video) {
		System.out.println("FullHd");
		return 250 + calcula(video);
	}

}
