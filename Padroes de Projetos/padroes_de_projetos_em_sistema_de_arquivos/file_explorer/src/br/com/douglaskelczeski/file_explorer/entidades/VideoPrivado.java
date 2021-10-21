package br.com.douglaskelczeski.file_explorer.entidades;

public class VideoPrivado extends Video {
	private double senha;

	public VideoPrivado(String nome, String formato, double tamanho, double senha) {
		super(nome, formato, tamanho);
		this.senha = senha;
	}

	public double getSenha() {
		return senha;
	}

	public void setSenha(double senha) {
		this.senha = senha;
	}

	@Override
	public String getType() {
		return " Visibilidade...==>Video Privado ***** ;) ";
	}

}
