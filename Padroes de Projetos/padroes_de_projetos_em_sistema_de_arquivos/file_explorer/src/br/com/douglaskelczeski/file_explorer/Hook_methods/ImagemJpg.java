package br.com.douglaskelczeski.file_explorer.Hook_methods;

public class ImagemJpg extends Imagem {

	
	public ImagemJpg(String nome, String formato, double tamanho) {
		super(nome, formato, tamanho);

	}

	@Override
	protected String typeEstensao(){
		return ".jpg";
	}

}
