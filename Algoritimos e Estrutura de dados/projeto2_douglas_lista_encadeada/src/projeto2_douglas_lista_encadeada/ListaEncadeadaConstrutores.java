package projeto2_douglas_lista_encadeada;

import java.util.Scanner;

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
			System.out.println ("\nConstrutor(a) numero: [" + aux.construtor.id + "] " + "\tNome: " + aux.construtor.nome
					+ "\tcpf: " + aux.construtor.cpf + "\tIdade: " + aux.construtor.idade
					+ "\tNaturalidade: " + aux.construtor.naturalidade + "\n");
			aux = aux.prox;
			
		}
	}
	
	public Construtor getConstrutor(int pos) {
		ElementoConstrutor aux = primeiro;
		for(int i = 0; i < numElementos; i++) {
			if(i == pos) {
				return aux.construtor;				
			}
			aux = aux.prox;
		}
		System.out.println("ELEMENTO NÃO ENCONTRADO");
		return null;
		
	}
	public Construtor getConstrutorId(int id) {
		ElementoConstrutor aux = primeiro;
		for(int i = 0; i < numElementos; i++) {
			if(aux.construtor.id == id) {
				return aux.construtor;				
			}
			aux = aux.prox;
		}
		System.out.println("ELEMENTO NÃO ENCONTRADO");
		return null;
		
	}	
	public void editar(int id, Scanner entrada) {
		ElementoConstrutor aux = primeiro;
		
		
		for(int i = 0; i < numElementos; i++) {
			if(aux.construtor.id == id) {
				System.out.println("Que informação você quer editar \t Para cancelar operação digite: 0"
						+ "\n1 - Nome" + "\n2 - CPF"
						+ "\n3 - Idade" + "\n4 - Nacionalidade");
				
				int opcao = Integer.valueOf(entrada.nextLine());
				
				switch(opcao) {
				
				case 1:
					System.out.println("Digite o nome do Construtor");
					String nome = entrada.nextLine();
					aux.construtor.nome = nome;
					System.out.println("OPERAÇÃO REALIZADA COM SUCESSO");
					return;
					
				case 2:
					System.out.println("Digite o cpf do Construtor");
					Long cpf = entrada.nextLong();
					aux.construtor.cpf = cpf;
					System.out.println("OPERAÇÃO REALIZADA COM SUCESSO");
					return;
					
				case 3:
					System.out.println("Digite a idade do Construtor");
					int idade = entrada.nextInt();
					aux.construtor.idade = idade;
					System.out.println("OPERAÇÃO REALIZADA COM SUCESSO");
					return;
					
				case 4:
					System.out.println("Digite a naturalidade do Construtor");
					String naturalidade = entrada.nextLine();
					aux.construtor.naturalidade = naturalidade;
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
		ElementoConstrutor aux = primeiro;
		ElementoConstrutor antAux = null;
		
		for(int i = 0; i < numElementos; i++) {			
			if(aux.construtor.id == id) {
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
