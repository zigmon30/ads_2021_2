package br.com.douglaskelczeski.file_explorer.Observer;

import java.util.*;


public class AlertaSistema implements Observer, Dispositivo{                           //observador

	@Override
	public void inserido() {
		System.out.println("Atenção!: Dispositivo inserido no Sistema");
		
	}

	@Override
	public void removido() {
		System.out.println("Atenção!: Dispositivo removido do Sistema");
		
	}

	@Override
	public void formatado() {
		System.out.println("Atenção!: Dispositivo formatado ");
		
	}

	@Override
	public void corronpido() {
		System.out.println("Atenção!: Dispositivo com dados corrompido");		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		DispositivoTerminal terminalOservado = (DispositivoTerminal)arg0;
		String comando = String.valueOf(arg1);
		
		if(comando.equals("inserido")) {
			this.inserido();
		}
		else if(comando.equals("removido")) {
			this.removido();
		}
		else if(comando.equals("formatado")) {
			this.formatado();
		}
		else if(comando.equals("corrompido")) {
			this.corronpido();
		}
		
	}
	
	


	
	

}
