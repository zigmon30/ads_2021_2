package br.com.douglaskelczeski.file_explorer.command;

import java.util.ArrayList;

public class Broker {
	
	private ArrayList<ComandoIF> listaComandos = new ArrayList<ComandoIF>();
	
	public void adicionaComando(ComandoIF comando) {   /*add acoes em uma oordem*/
		listaComandos.add(comando);
		
	}
	
	public void executaComando() {
		for (ComandoIF comando : listaComandos) {       /* percorre as acões e executa os comandos*/
			comando.reproduzir();
		}
		
		listaComandos.clear();
		
	}
	

}
