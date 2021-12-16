package br.com.douglaskelczeski.file_explorer.Hook_methods;

public abstract class Imagem {
	private String nome;
	private String formato;
	private double tamanho;

	// metodo construtor

	public Imagem(String nome, String formato, double tamanho) {
		super();
		this.nome = nome;
		this.formato = formato;
		this.tamanho = tamanho;
	}

	public Imagem(String nome, double tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) { 
		this.nome = nome;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	// comportamento da classe usando o Hook methods
	public String getFormatarEstensaoImagem() {
		return typeEstensao();
	}

	protected abstract String typeEstensao();

}
