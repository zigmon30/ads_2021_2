package projeto2_douglas_lista_encadeada;

import java.util.Scanner;

public class ListaEncadeadaImoveis {
	
	int numElementos;
	ElementoImovel primeiro;
	ElementoImovel ultimo;
	
	public ListaEncadeadaImoveis() {
		numElementos = 0;
		primeiro = null;
		ultimo = null;
	}
	
	public void inserir(Imovel novoImovel) {

		
		ElementoImovel  novoElementoImovel = new ElementoImovel();
		novoElementoImovel.imovel = novoImovel;
		novoElementoImovel.prox = null;
		
		if(numElementos == 0) {
			primeiro = novoElementoImovel;
			ultimo = novoElementoImovel;
			numElementos++;
			return;			
		}
		
		ultimo.prox = novoElementoImovel;
		ultimo = novoElementoImovel;
		numElementos++;
		return;
		
	}
	
	public void listar() {

		ElementoImovel aux = primeiro;
		
		for(int i=0; i<numElementos; i++) {
			System.out.println ("\nImovel/construção numero: [" + aux.imovel.id + "] " + "\tNome: " + aux.imovel.nome
					+ "\ttipo: " + aux.imovel.tipo + "\tArea: " + aux.imovel.area
					+ "\tAno da construção: " + aux.imovel.anoConstrução
					+ "\tLocalidade da construção: " + aux.imovel.localConstrucao
					+ "\n"
					+ "Construtor(a): " + aux.imovel.construtor.nome
					+ "\n");
			aux = aux.prox;
			
		}
	}

	public void editar(int id, Scanner entrada) {
		ElementoImovel aux = primeiro;
		
		
		for(int i = 0; i < numElementos; i++) {
			if(aux.imovel.id == id) {
				System.out.println("Que informação você quer editar \t Para cancelar operação digite: 0"
						+ "\n1 - Nome" + "\n2 - tipo"
						+ "\n3 - area" + "\n4 - local da obra");
				
				int opcao = Integer.valueOf(entrada.nextLine());
				
				switch(opcao) {
				
				case 1:
					System.out.println("Digite o nome do imovel/construção");
					String nome = entrada.nextLine();
					aux.imovel.nome = nome;
					System.out.println("OPERAÇÃO REALIZADA COM SUCESSO");
					return;
					
				case 2:
					System.out.println("Digite o tipo da construção");
					String  tipo = entrada.nextLine();
					aux.imovel.tipo = tipo;
					System.out.println("OPERAÇÃO REALIZADA COM SUCESSO");
					return;
					
				case 3:
					System.out.println("Digite a area construida");
					int area = entrada.nextInt();
					aux.imovel.area = area;
					System.out.println("OPERAÇÃO REALIZADA COM SUCESSO");
					return;
					
				case 4:
					System.out.println("Digite o local da obra");
					String local = entrada.nextLine();
					aux.imovel.localConstrucao = local;
					System.out.println("OPERAÇÃO REALIZADA COM SUCESSO");
					return;
					
				default :
					System.out.println("OPCÃO INVALIDA, OPERAÇAO CANCELADA");
				}
				
				
				
				
				
			}
			aux = aux.prox;
		}
		System.out.println("DIRETOR NÃO ENCONTRADO, OPERAÇÃO CANCELADA");
		
		
	}

	public void remover(int id) {
		ElementoImovel aux = primeiro;
		ElementoImovel antAux = null;
		
		for(int i = 0; i < numElementos; i++) {			
			if(aux.imovel.id == id) {
				if(aux == primeiro) {
					primeiro = primeiro.prox;
					numElementos--;
					if(aux == ultimo) {
						ultimo = null;
					}
					return;					
				}
				antAux.prox = aux.prox;
				numElementos--;
				
				if(aux == ultimo) {
					ultimo = antAux;					
				}
				return;				
			}			
			antAux = aux;
			aux = aux.prox;			
		}
		System.out.println("CONSTRUTOR NÃO ENCONTRADO, OPERAÇÃO CANCELADA!");
	}
}
