package br.com.douglaskelczeski.file_explorer.entidades;

public class ImagemPrivada extends Imagem {
	private double senha;

	public ImagemPrivada(String nome, String formato, double tamanho, double senha) {
		super(nome, formato, tamanho);
		this.setSenha(senha);
	}

	public double getSenha() {
		return senha;
	}

	public void setSenha(double senha) {
		this.senha = senha;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Visibilidade...==> privada ******* ;)";
	}
}
