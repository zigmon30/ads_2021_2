package br.com.douglaskelczeski.file_explorer.entidades;

public class ImagemLivre extends Imagem {

	// metodo construtor

	public ImagemLivre(String nome, String formato, double tamanho) {
		super(nome, formato, tamanho);

	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return " Visibilidade...==> livre para todos :)";
	}

}
