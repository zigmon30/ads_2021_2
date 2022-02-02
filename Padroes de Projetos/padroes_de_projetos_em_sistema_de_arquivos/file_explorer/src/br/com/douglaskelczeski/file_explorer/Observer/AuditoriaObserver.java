package br.com.douglaskelczeski.file_explorer.Observer;

import java.util.Observer;

@SuppressWarnings("deprecation")
public class AuditoriaObserver extends ObserverNotificacao{

	
	public AuditoriaObserver(InterfaceNotificacao tela){
		this.subject = tela;
		this.subject.addObserver((Observer) this);
	}
	
	@Override
	public void atualizarDados() {
		System.out.println("Atualizando auditoria a partir de ObserverNotificação...");
		
	}
	
	

}
