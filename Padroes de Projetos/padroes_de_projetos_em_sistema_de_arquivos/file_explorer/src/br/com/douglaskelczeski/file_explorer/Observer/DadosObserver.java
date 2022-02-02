package br.com.douglaskelczeski.file_explorer.Observer;

import java.util.Observer;

@SuppressWarnings("deprecation")
public class DadosObserver extends ObserverNotificacao{

	
	public DadosObserver(InterfaceNotificacao tela){
		this.subject = tela;
		this.subject.addObserver((Observer) this);
	}
	
	@Override
	public void atualizarDados() {
		
		System.out.println("Atualizando dados a partir de ObserverNotificação...");
		
	}
	
	

}
