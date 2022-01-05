package br.com.douglaskelczeski.file_explorer.state;

public class Dispositivo {
	// atributos da classe
	private String nome;
	private double capacidade;
	private double capacidadeUsada;
	protected DispositivoState estado;
	

	
	public Dispositivo(String nome) {
		estado = new DispositivoSelecionado();
		this.nome = nome;
	}
	
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

//	public double getCapacidade() {
//		return capacidade;
//	}
//
//	public void setCapacidade(double capacidade) {
//		this.capacidade = capacidade;
//	}
//
//	public double getCapacidadeUsada() {
//		return capacidadeUsada;
//	}
//
//	public void setCapacidadeUsada(double capacidadeUsada) {
//		this.capacidadeUsada = capacidadeUsada;
//	}
//
//	public FabricanteDispositivoArmazenamento getFabricante() {
//		return fabricante;
//	}
//
//	public void setFabricante(FabricanteDispositivoArmazenamento fabricante) {
//		this.fabricante = fabricante;
//	}

}
