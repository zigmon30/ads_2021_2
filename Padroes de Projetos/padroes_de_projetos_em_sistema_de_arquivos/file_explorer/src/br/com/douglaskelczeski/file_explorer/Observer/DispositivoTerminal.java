package br.com.douglaskelczeski.file_explorer.Observer;

import java.util.*;



public class DispositivoTerminal extends Observable implements Dispositivo{
	
	private String comando = "";

	@Override
	public void inserido() {
		comando = "inserido";
		System.out.println("09090Dispositivo inserido no Sistema");
		this.atualizaEstado();

	}

	

	@Override
	public void removido() {
		comando = "removido";
		System.out.println("Dispositivo removido do Sistema");
		this.atualizaEstado();
	}

	@Override
	public void formatado() {
		comando = "formatado";
		System.out.println("Dispositivo formatado");
		this.atualizaEstado();
	}

	@Override
	public void corronpido() {
		comando = "inserido";
		System.out.println("Dispositivo corrompido");
		this.atualizaEstado();
	}

	
	private void atualizaEstado() {
		setChanged(); //atualiza o Estado
		notifyObservers(comando);//notifica os observadores
		
	}
	
	

}
