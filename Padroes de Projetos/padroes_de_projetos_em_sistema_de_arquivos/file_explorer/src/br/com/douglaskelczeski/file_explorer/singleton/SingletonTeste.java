package br.com.douglaskelczeski.file_explorer.singleton;

public class SingletonTeste {

	public static void main(String[] args) {
		VideoReprodutor reprodutorVideo = new VideoProxy("Cosmos episodio 1.mkv");
		
		reprodutorVideo.reprodutor();
		System.out.println();
		
		reprodutorVideo.reprodutor();
		System.out.println();
	

	}

}
