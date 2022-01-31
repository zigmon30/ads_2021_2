package br.com.douglaskelczeski.file_explorer.command;


public class CommadMain {

	
	public static void main(String[] args){
		
		VideoReprodutor reproduzir = new VideoReprodutor();
		
		ReproducaoNormal reproNormal = new ReproducaoNormal(reproduzir);
		ReproducaoRapida reproRapida = new ReproducaoRapida(reproduzir);
		ReproducaoLenta reproLenta = new ReproducaoLenta(reproduzir);
		
		Broker velocidade = new Broker();
		velocidade.adicionaComando(reproNormal);
		velocidade.adicionaComando(reproLenta);
		velocidade.adicionaComando(reproRapida);
		velocidade.adicionaComando(reproNormal);
		velocidade.adicionaComando(reproNormal);
		velocidade.executaComando();
		
		
	}
	
}