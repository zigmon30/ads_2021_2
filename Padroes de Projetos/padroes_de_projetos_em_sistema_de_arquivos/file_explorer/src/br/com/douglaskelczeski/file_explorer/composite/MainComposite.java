package br.com.douglaskelczeski.file_explorer.composite;

public class MainComposite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audio musica1 = new Audio("Arara", ".mp3", 23);
		
		
		
		Pasta novaPasta = new Pasta("Misturadas");
		novaPasta.adicionaMusica(musica1);
		
		
		System.out.println("");

	}

}
