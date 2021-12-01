package br.com.douglaskelczeski.file_explorer.entidades;

public class DispositivoFactory {
	public static Dispositivo criarDispositivo(String nome, double capacidade, double capacidadeUsada, FabricanteDispositivoArmazenamento fabricante) {
		Dispositivo dispositivos = new Dispositivo(nome, capacidade, capacidadeUsada);
		if(fabricante == null ) {
			dispositivos.setFabricante(new FabricanteDispositivoNull());
		}else {
			dispositivos.setFabricante(fabricante);
		}
			
		return dispositivos;
		
		
	}

}
