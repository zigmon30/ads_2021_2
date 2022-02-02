package br.com.douglaskelczeski.file_explorer.Observer;


public class ObserverTest {

	
	public static void main(String[] args) {
		//observador
		DispositivoAcaoMetodos notificacoes = new DispositivoAcaoMetodos();
		
		//observado
		
		DispositivoTerminal terminal1 = new DispositivoTerminal();
		
		
		//adicionar observador ao observado
		terminal1.addObserver(notificacoes);
		
		terminal1.inserido();
		terminal1.removido();
		terminal1.formatado();
		terminal1.corronpido();
		
		
		
	}
	
	
	
	
}
