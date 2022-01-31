package br.com.douglaskelczeski.file_explorer.decorator;

public class SdPadrao extends Formatos {
	
	
	//construtores
	public SdPadrao() {
		super();
	
	}

	public SdPadrao(Formatos outroFormato) {
		super(outroFormato);
	
	}

	@Override
	public double calculaTamanho(Video video) {
		System.out.println("Formato Padrão");
		return  0 + calcula(video);
	}

}
