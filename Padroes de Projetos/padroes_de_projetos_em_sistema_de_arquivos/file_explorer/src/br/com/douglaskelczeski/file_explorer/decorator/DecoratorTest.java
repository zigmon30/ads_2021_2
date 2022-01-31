package br.com.douglaskelczeski.file_explorer.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		
		Video video = new Video("Conde Dracula", "dff", 30);
		
		Formatos formatoPadrao = new SdPadrao();
		Formatos formatoHd = new Hd();
		Formatos formatoFullHd = new FullHd();
		
		double tamanho0 = formatoPadrao.calculaTamanho(video);
		double tamanho1 = formatoHd.calculaTamanho(video);
		double tamanho2 = formatoFullHd.calculaTamanho(video);

		System.out.println("Nome: " + video.getNome() 
						   +"\nExtenção do arquivo: " + video.getFormatarVideo()
						   +"\nTamanho do arquivo em resoluçao SD: " +video.getTamanho() + tamanho0
						   +"\nTamanho do arquivo em resoluçao HD: " +video.getTamanho() + tamanho1
						   +"\nTamanho do arquivo em resoluçao FULHD: " +video.getTamanho() + tamanho2);
		
		
		
		
		
		
		

	}

}
