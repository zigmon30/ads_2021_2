package br.com.douglaskelczeski.file_explorer.entidades;

public class Dispositivo {
	// atributos da classe
	private String nome;
	private double capacidade;
	private double capacidadeUsada;
	private FabricanteDispositivoArmazenamento fabricante;

	// metodo construtor
	public Dispositivo(String nome, double capacidade, double capacidadeUsada) {
		super();
		this.nome = nome;
		this.capacidade = capacidade;
		this.capacidadeUsada = capacidadeUsada;
	}

	public Dispositivo(String nome, double capacidade) {
		this.nome = nome;
		this.capacidade = capacidade;

	}

	// Comportamento da classe
	public double getCapacidadeRestante() {
		return capacidade - capacidadeUsada;
	}

	// metodos get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	public double getCapacidadeUsada() {
		return capacidadeUsada;
	}

	public void setCapacidadeUsada(double capacidadeUsada) {
		this.capacidadeUsada = capacidadeUsada;
	}

	public FabricanteDispositivoArmazenamento getFabricante() {
		return fabricante;
	}

	public void setFabricante(FabricanteDispositivoArmazenamento fabricante) {
		this.fabricante = fabricante;
	}

}
