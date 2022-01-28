package projeto2_douglas_lista_encadeada;

import java.util.Scanner;



public class PrincipalMain {

	public static void main(String[] args) {
		
		ListaEncadeadaConstrutores listaCosntrutores = new ListaEncadeadaConstrutores();
		ListaEncadeadaImoveis listaImoveis = new ListaEncadeadaImoveis();
		
		iniciarListaConstrutores(listaCosntrutores);
		iniciarListaImoveisConstruidos(listaImoveis, listaCosntrutores);
		
		int idConstrutores = 3;
		int idImoveis = 3;

		System.out.println("Num Elementos " + listaCosntrutores.numElementos
							+"\nPrimeiro = " + listaCosntrutores.primeiro
							+"\nUltimo = " + listaCosntrutores.ultimo);
		
		
		
		int opcao = 1;
		Scanner entrada = new Scanner(System.in);
		
		while(opcao != 0) {
			System.out.println("");
			System.out.println("Programa para cadastro de construções de imoveis"
					            + " e cadastro de construtores responsaveis pelas obras");
			System.out.println("");
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Digite:                                                                    -");
			System.out.println("                                                                           -");
			System.out.println("(0) para sair                                                              -");
			System.out.println("(1) para cadastrar um construtor(a)                                        -");
			System.out.println("(2) para listar todos os construtores cadastrados                          -");
			System.out.println("(3) para editar um Construtor(a)                                           -");
			System.out.println("(4) para remover um Construtor(a)                                          -");
			System.out.println("(5) para cadastrar um novo imovel                                          -");
			System.out.println("(6) para listar todos os imoveis cadastrados                               -");
			System.out.println("(7) para editar um Imovel                                                  -");
			System.out.println("(8) para remover um Imovel                                                 -");
			System.out.println("----------------------------------------------------------------------------");
			System.out.print("Digite sua opção: ");			
			opcao = Integer.valueOf(entrada.nextLine());
			int idConstrutor;
			switch(opcao) {
			
			case 0:
				return;
			case 1:
				Construtor novoConstrutor = new Construtor();	
				novoConstrutor.id = idConstrutores;
				
				
				System.out.print("Nome: ");
				novoConstrutor.nome = entrada.nextLine();
				System.out.print("Cpf: ");
				novoConstrutor.cpf = entrada.nextLong();
				entrada.nextLine();
				System.out.print("Idade: ");
				novoConstrutor.idade = Integer.parseInt(entrada.nextLine());
				System.out.print("Naturalidade: ");
				novoConstrutor.naturalidade = entrada.nextLine();
				listaCosntrutores.inserir(novoConstrutor);
				idConstrutores++;
				break;
				
			case 2:
				listaCosntrutores.listar();
				break;
				
			case 3:
				System.out.println("Digite o numero do Construtor que deseja editar: ");
				idConstrutor = Integer.valueOf(entrada.nextLine());
				listaCosntrutores.editar(idConstrutor, entrada);
				break;
				
			case 4:
				System.out.println("Digite o numero do Construtor que deseja remover: ");
				idConstrutor = Integer.valueOf(entrada.nextLine());
				listaCosntrutores.remover(idConstrutor);
				System.out.println("OPERAÇÃO REALIZADA COM SUCESSO :)");
				break;
				
			case 5:
				Imovel novoImovel = new Imovel();
				novoImovel.id = idImoveis;
				System.out.print("Nome: ");
				novoImovel.nome = entrada.nextLine();
				System.out.print("Tipo: ");
				novoImovel.tipo = entrada.nextLine();
				System.out.print("Area construida: ");
				novoImovel.area = Integer.parseInt(entrada.nextLine());
				System.out.print("Localidade do Imovel: ");
				novoImovel.localConstrucao = entrada.nextLine();
				System.out.print("Ano de Construção: ");
				novoImovel.anoConstrução = Integer.parseInt(entrada.nextLine());
				
				ElementoConstrutor aux = listaCosntrutores.primeiro;
				
				for (int i = 0; i < listaCosntrutores.numElementos; i++) {
					System.out.println("id = "
							+ aux.construtor.id
							+ " nome = "
							+ aux.construtor.nome);
					aux = aux.prox;
						
					}
				System.out.print("id do construtor da obra: ");
				idConstrutor = Integer.valueOf(entrada.nextLine());
				Construtor cons = listaCosntrutores.getConstrutor(idConstrutor);
				if (cons == null) {
					System.out.println("OPERAÇÃO CANCELADA!");
					
				}else {
					novoImovel.construtor = cons;
					listaImoveis.inserir(novoImovel);
					idImoveis++;
				}
				break;
				
			case 6:
				listaImoveis.listar();
				break;
				
			case 7:
				System.out.println("Digite o numero do imovel/construção  que deseja editar: ");
				idImoveis = Integer.valueOf(entrada.nextLine());
				listaImoveis.editar(idImoveis, entrada);
				break;
				
			case 8:
				System.out.println("Digite o numero do Imovel que deseja remover: ");
				idImoveis = Integer.valueOf(entrada.nextLine());
				listaImoveis.remover(idImoveis);
				System.out.println("OPERAÇÃO REALIZADA COM SUCESSO :)");
				break;
				
			default:
				System.out.println("OPCÃO INVALIDA");
				
			
					
				}
			
				
			}
		}
		
		
		
		
	

	private static void iniciarListaImoveisConstruidos(ListaEncadeadaImoveis listaImoveis,
			ListaEncadeadaConstrutores listaCosntrutores) {
		
		
		Imovel imo = new Imovel();
		int idImoveis = 0;
		imo.id = idImoveis ;
		imo.nome = "Residencial Boa Vista";
		imo.tipo = "Condominio";
		imo.area = 1000;
		imo.localConstrucao = "Tres Barras Alto do Mussi";
		imo.anoConstrução = 1995;
		imo.construtor = listaCosntrutores.getConstrutor(0);

		listaImoveis.inserir(imo);
		idImoveis++;
		
		imo = new Imovel();
		imo.id = idImoveis;
		imo.nome = "Bar do Tonho";
		imo.tipo = "Imovel Comercial";
		imo.area = 80;
		imo.localConstrucao = "Tres Barras, Bairro São Cristóvão";
		imo.anoConstrução = 2000;
		imo.construtor = listaCosntrutores.getConstrutor(0);

		listaImoveis.inserir(imo);
		idImoveis++;
		
		imo = new Imovel();
		imo.id = idImoveis;
		imo.nome = "Igreja Pica das Galaxias";
		imo.tipo = "Imovel Comercial";
		imo.area = 2000;
		imo.localConstrucao = "Israel, murro das lamentações";
		imo.anoConstrução = 0000;
		imo.construtor = listaCosntrutores.getConstrutor(1);

		listaImoveis.inserir(imo);
		idImoveis++;

		
	}

	private static void iniciarListaConstrutores(ListaEncadeadaConstrutores listaCosntrutores) {
		Construtor cons = new Construtor();
		int idConstrutores = 0;
		
		cons.id = idConstrutores;
		cons.nome = "Não especificado";
		cons.cpf = 11111111111L;
		cons.idade = 0;
		cons.naturalidade = " ";

		listaCosntrutores.inserir(cons);
		idConstrutores++;
		
		cons = new Construtor();
		cons.id = idConstrutores;
		cons.nome = "Douglas de Lara";
		cons.cpf = Long.parseLong("33333333333");
		cons.idade = 55;
		cons.naturalidade = "Canoinhence";

		listaCosntrutores.inserir(cons);
		idConstrutores++;


		cons = new Construtor();
		cons.id = idConstrutores;
		cons.nome = "Elenita Zaluski Kelczeski";
		cons.cpf = Long.parseLong("22222222222");
		cons.idade = 35;
		cons.naturalidade = "Mafrense";
		
		listaCosntrutores.inserir(cons);
		idConstrutores++;
		

		
	}

}
