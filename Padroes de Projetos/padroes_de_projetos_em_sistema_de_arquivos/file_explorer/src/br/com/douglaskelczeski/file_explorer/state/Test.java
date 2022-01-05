package br.com.douglaskelczeski.file_explorer.state;

import java.util.ArrayList;

import br.com.douglaskelczeski.file_explorer.entidades.FabricanteDispositivoArmazenamento;
//import br.com.douglaskelczeski.file_explorer.entidades.Dispositivo;

public class Test {

	static ArrayList<Dispositivo> dispositivos = new ArrayList<Dispositivo>();
	static ArrayList<FabricanteDispositivoArmazenamento> fabricantes = new ArrayList<FabricanteDispositivoArmazenamento>();

	public static void main(String[] args) {

		Dispositivo dis6 = new Dispositivo("Barracuda");
		System.out.println(dis6.estado + " " + dis6.getNome() + " \n");
		
		dis6.ejetarDispositivo();
		
		dis6.formatarDispositivo();
		System.out.println(dis6.estado + " " + dis6.getNome() + " \n");

		dis6.formatarDispositivo();
		System.out.println(dis6.estado + " " + dis6.getNome() + " \n");

		dis6.selecionarDispositivo();
		System.out.println(dis6.estado + " " + dis6.getNome() + " \n");

		dis6.ejetarDispositivo();
		System.out.println(dis6.estado + " " + dis6.getNome() + " \n");

		dis6.selecionarDispositivo();
		System.out.println(dis6.estado + " " + dis6.getNome() + " \n");

		dis6.selecionarDispositivo();
		System.out.println(dis6.estado + " " + dis6.getNome() + " \n");

		dis6.formatarDispositivo();
		System.out.println(dis6.estado + " " + dis6.getNome() + " \n");
		
		dis6.ejetarDispositivo();
		System.out.println(dis6.estado + " " + dis6.getNome() + " \n");

	}

}
