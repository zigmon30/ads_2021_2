package br.com.douglaskelczeski.file_explorer.Hook_methods;

public class ImagemGif extends Imagem {
	

	public ImagemGif(String nome, String formato, double tamanho) {
		super(nome, formato, tamanho);		
	}
	
	@Override
	protected String typeEstensao(){
		return ".gif";
	}



}
