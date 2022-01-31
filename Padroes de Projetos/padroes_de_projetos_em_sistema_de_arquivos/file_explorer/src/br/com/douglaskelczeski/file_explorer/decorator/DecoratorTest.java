package br.com.douglaskelczeski.file_explorer.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		
		Video video = new Video("Conde Dracula", "", 30);
		
		Formatos formatoPadrao = new SdPadrao();
		Formatos formatoHd = new Hd();
		Formatos formatoFullHd = new FullHd();
		
		System.out.println("extenções criadas para o video: ");

		
		double tamanho0 = formatoPadrao.calculaTamanho(video);
		double tamanho1 = formatoHd.calculaTamanho(video);
		double tamanho2 = formatoFullHd.calculaTamanho(video);

		System.out.println("\nNome: " + video.getNome() 
						   +"\nExtenção do arquivo: " + video.getFormatarVideo()
						   +"\nTamanho do arquivo em resoluçao SD: " +video.getTamanho() + " + " +  tamanho0+  " adicionais"
						   +"\nTamanho do arquivo em resoluçao HD: " +video.getTamanho() + " + " +  tamanho1+  " adicionais" 
						   +"\nTamanho do arquivo em resoluçao FULHD: " +video.getTamanho() + " + " +  tamanho2+  " adicionais");
		
		
		
		
		
		
		

	}

}
