package br.com.douglaskelczeski.file_explorer.composite;

public class MainComposite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audio musica1 = new Audio("Arara", ".MP3", 23);
		Audio musica2 = new Audio("O Segundo Sol", ".MP4", 23);
		Audio musica3 = new Audio("The Sound of Silence", ".ACC", 23);
		Audio musica4 = new Audio("Nemesis", ".FLAC", 23);
		Audio musica5 = new Audio("The World Is Yours", ".MP3", 23);		
		
		Pasta novaPasta = new Pasta("Misturadas");                                             
		novaPasta.adicionaMusica(musica1);
		novaPasta.adicionaMusica(musica2);
		novaPasta.adicionaMusica(musica3);
		novaPasta.adicionaMusica(musica4);
		novaPasta.adicionaMusica(musica5);
		
		Pasta novaPasta1 = new Pasta("Rock");
		novaPasta1.adicionaMusica(musica1);
		novaPasta1.adicionaMusica(musica2);
		novaPasta1.adicionaMusica(musica3);
		novaPasta1.adicionaMusica(musica4);
		novaPasta1.adicionaMusica(musica5);
		
		
		System.out.println("\nPasta Musicas ==> " + novaPasta.getNomePasta());
		for(Audio musica : novaPasta.getLAudios()) {
			System.out.println(musica.getNome() + musica.getFormato());
		}
		
		System.out.println("\nPasta Musicas ==> " + novaPasta1.getNomePasta());
		for(Audio musica : novaPasta1.getLAudios()) {
			System.out.println(musica.getNome() + musica.getFormato());
		}
		
		novaPasta1.removeMusica(musica1);
		
		System.out.println("\nPasta Musicas ==> " + novaPasta1.getNomePasta());
		for(Audio musica : novaPasta1.getLAudios()) {
			System.out.println(musica.getNome() + musica.getFormato());
		}


	}

}
