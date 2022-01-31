package br.com.douglaskelczeski.file_explorer.decorator;

public class Hd extends Formatos {
	
	
	//construtores

	public Hd() {
		super();
	
	}

	public Hd(Formatos outroFormato) {
		super(outroFormato);
	
	}

	@Override
	public double calculaTamanho(Video video) {
		System.out.println("Hd");
		double tamanho = 100;
		return  tamanho + calcula(video);
	}

}
