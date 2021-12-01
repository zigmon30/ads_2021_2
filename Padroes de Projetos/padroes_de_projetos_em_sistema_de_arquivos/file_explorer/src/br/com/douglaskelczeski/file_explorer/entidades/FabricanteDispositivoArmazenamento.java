package br.com.douglaskelczeski.file_explorer.entidades;

public class FabricanteDispositivoArmazenamento {
	private String nomeDispositivo;
	private String modelo;
	
	public FabricanteDispositivoArmazenamento() {
		
		
	}

	public FabricanteDispositivoArmazenamento(String nomeDispositivo, String modelo) {
		//super();
		this.nomeDispositivo = nomeDispositivo;
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNomeDispositivo() {
		return nomeDispositivo;
	}

	public void setNomeDispositivo(String nomeDispositivo) {
		this.nomeDispositivo = nomeDispositivo;
	}

}
