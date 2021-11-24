package br.com.douglaskelczeski.file_explorer.entidades;

public class FabricanteDispositivoNull extends FabricanteDispositivoArmazenamento {
	
	public String getModelo() {
		return "Sem Modelo Especifico ou não cadastrado no Sistema";
	}

	public String getNomeDispositivo() {
		return "Sem Fabricante Especifico ou não cadastrado no Sistema";
	}

	

}
