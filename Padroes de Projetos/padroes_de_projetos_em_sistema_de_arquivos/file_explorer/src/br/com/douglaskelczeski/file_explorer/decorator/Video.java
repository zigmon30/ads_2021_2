package br.com.douglaskelczeski.file_explorer.decorator;

public class Video {
	// atributos
	private String nome;
	private String formato;
	private double tamanho;

	// metodo construtor
	public Video(String nome, String formato, double tamanho) {
		super();
		this.nome = nome;
		this.formato = formato;
		this.tamanho = tamanho;
	}
	
	public Video(double tamanho) {
		this.tamanho = tamanho;
	}
	public Video() {
		
	}

//metodos getters and setters:
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

	// comportamento da classe
	public String getFormatarVideo() {
		// TODO Auto-generated method stub
		return formato = ".mkv";
	}

}
