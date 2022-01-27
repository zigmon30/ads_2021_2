package projeto2_douglas_lista_encadeada;

public class ListaEncadeadaConstrutores {
	
	int numElementos;
	ElementoConstrutor primeiro;
	ElementoConstrutor ultimo;
	
	public ListaEncadeadaConstrutores() {
		super();
		numElementos = 0;
		primeiro = null;
		ultimo = null;
	}
	
	public void inserir(Construtor novoConstrutor) {

		
		ElementoConstrutor  novoElementoConstrutor = new ElementoConstrutor();
		novoElementoConstrutor.construtor = novoConstrutor;
		novoElementoConstrutor.prox = null;
		
		if(numElementos == 0) {
			primeiro = novoElementoConstrutor;
			ultimo = novoElementoConstrutor;
			numElementos++;
			return;			
		}
		
		ultimo.prox = novoElementoConstrutor;
		ultimo = novoElementoConstrutor;
		numElementos++;
		return;
		
	}
	
	public void listar() {
		ElementoConstrutor aux = primeiro;
		
		for(int i=0; i<numElementos; i++) {
			System.out.println("\nConstrutor(a) numero: [" + i + "] " + "\tNome: " + aux.construtor.nome
					+ "\tcpf: " + aux.construtor.cpf + "\tIdade: " + aux.construtor.idade
					+ "\tNaturalidade: " + aux.construtor.naturalidade + "\n");
			aux = aux.prox;
			
		}
	}
	

}
