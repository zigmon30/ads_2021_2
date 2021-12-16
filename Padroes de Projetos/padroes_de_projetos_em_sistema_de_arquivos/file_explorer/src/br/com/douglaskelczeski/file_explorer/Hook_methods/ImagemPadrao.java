package br.com.douglaskelczeski.file_explorer.Hook_methods;

public class ImagemPadrao extends Imagem {

	// metodo construtor

	public ImagemPadrao(String nome, String formato, double tamanho) {
		super(nome, formato, tamanho);

	}

	@Override
	protected String typeEstensao() {
		// TODO Auto-generated method stub
		return ".bitmap";
	}



}
