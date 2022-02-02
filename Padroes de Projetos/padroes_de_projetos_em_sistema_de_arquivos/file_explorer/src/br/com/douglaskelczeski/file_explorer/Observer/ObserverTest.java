package br.com.douglaskelczeski.file_explorer.Observer;


public class ObserverTest {

	
	public static void main(String[] args){
		InterfaceNotificacao tela = new InterfaceNotificacao();
		
		new AuditoriaObserver(tela);
		new DadosObserver(tela);
		
		
		System.out.println("Primeira notificação aos observadores...");
		tela.setNotificacao();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Segunda notificação aos observadores...");
		tela.setNotificacao();
	}
}