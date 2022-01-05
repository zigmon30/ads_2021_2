package br.com.douglaskelczeski.file_explorer.entidades;

import br.com.douglaskelczeski.file_explorer.state.DispositivoSelecionado;
import br.com.douglaskelczeski.file_explorer.state.DispositivoState;

public class Dispositivo {
	// atributos da classe
	private String nome;
	private double capacidade;
	private double capacidadeUsada;
	private FabricanteDispositivoArmazenamento fabricante;
	protected DispositivoState estado;
	
	public Dispositivo() {
		estado = new DispositivoSelecionado();
	}
	
	public void selecionarDispositivo() {
		estado = estado.selecionarDispositivo();
	}
	
	public void formatarDispositivo() {
		estado = estado.formatarDispositivo();
	}
	
	public void ejetarDispositivo() {
		estado = estado.ejetarDispositivo();
	}

	// metodo construtor
	public Dispositivo(String nome, double capacidade, double capacidadeUsada,
			FabricanteDispositivoArmazenamento fabricante) {
		super();
		this.nome = nome;
		this.capacidade = capacidade;
		this.capacidadeUsada = capacidadeUsada;
		this.fabricante = fabricante;
	}

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

	public DispositivoState getEstado() {
		return estado;
	}

	public void setEstado(DispositivoState estado) {
		this.estado = estado;
	}

	public void setFabricante(FabricanteDispositivoArmazenamento fabricante) {
		this.fabricante = fabricante;
	}

}
