package br.com.douglaskelczeski.file_explorer.Observer;


import java.util.ArrayList;
import java.util.Observer;


@SuppressWarnings("deprecation")
public class InterfaceNotificacao {

	
	public ArrayList<ObserverNotificacao> listaObservadores = new ArrayList<ObserverNotificacao>();
	
	
	public void setNotificacao(){
		notificarObservadores();
	}
	
	
	public void addObserver(Observer observer){
		this.listaObservadores.add((ObserverNotificacao) observer);
	}
	
	public void notificarObservadores(){
		
		for(ObserverNotificacao observer : listaObservadores){
			observer.atualizarDados();
		}
	}
	
}
