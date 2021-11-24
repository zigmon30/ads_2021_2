package projeto1_douglas_dados_heterogeneos;

import java.util.Scanner;

public class PrincipalMain {
	static boolean imprime = true;
	static boolean imprimeSemQuebra = true;
	static int MAX_IMOVEIS = 999;
	static int MAX_COSNTRUTORES = 999;

	static Imovel imoveis[] = new Imovel[MAX_IMOVEIS];
	static Construtor construtores[] = new Construtor[MAX_COSNTRUTORES];

	static int numImoveis = 0;
	static int numConstrutores = 0;

	public static void main(String[] args) {

		numConstrutores = iniciarVetorConstrutores(construtores, numConstrutores);
		numImoveis = iniciarVetorImoveisConstrucoes(construtores, imoveis, numImoveis);

		Scanner ler = new Scanner(System.in);
		ler.useDelimiter("\r?\n");

		while (true) {

			menu();

			int opecao = ler.nextInt();

			if (opecao == 0) {
				break;
			}

			if (opecao == 1) {
				while (true) {
					menuImoveis();

					int opecaoImo = ler.nextInt();

					if (opecaoImo == 0) {
						break;
					}

					if (opecaoImo == 1) {
						numImoveis = inserirImovel(imoveis, numImoveis, construtores, numConstrutores, ler);

					}

					if (opecaoImo == 2) {
						listarImoveis(imoveis, numImoveis);

					}

					if (opecaoImo == 3) {
						numImoveis = editarImovel(imoveis, numImoveis, ler);

					}

					if (opecaoImo == 4) {
						numImoveis = excluirImovel(imoveis, numImoveis, ler);

					}

				}

			}

			if (opecao == 2) {
				while (true) {
					menuConstrutures();

					int opecaoCon = ler.nextInt();

					if (opecaoCon == 0) {
						break;
					}

					if (opecaoCon == 1) {

						numConstrutores = inserirConstrutor(construtores, numConstrutores, ler);

					}

					if (opecaoCon == 2) {
						listarConstrutores(construtores, numConstrutores);
					}

					if (opecaoCon == 3) {

						numConstrutores = editarConstrutor(construtores, numConstrutores, ler);

					}

					if (opecaoCon == 4) {

						numConstrutores = excluirConstrutor(construtores, numConstrutores, ler);

					}

				}

			}
		}

	}

	static void menu() { // imprime menu principal
		println("");
		print("Programa para Ver os Imoveis e quem foi o responsaveis pelas cosntruções");
		println("");
		println("-------------------------------------------");
		println("Relatorio de Construtores e Imoveis       -");
		println("                                          -");
		println("(0) para sair                             -");
		println("(1) para Imoveis                          -");
		println("(2) costrutores                           -");
		println("Digite sua opção:                         -");
		println("-------------------------------------------");

	}

	static void menuImoveis() { // imprime menu Imoveis
		println("");
		println("---------------------");
		println("(0) para Voltar ao Menu Principal");
		println("(1) para inserir um novo Imovel");
		println("(2) para listar os Imoveis atualmente no sistema");
		println("(3) para Editar os Imoveis atualmente no sistema");
		println("(4) para Excluir algum Imovel atualmente no sistema");
		println("Digite sua opção:");
	}

	static void menuConstrutures() { // imprime menu construtores
		println("");
		println("---------------------");
		println("(0) para Voltar ao Menu Principal");
		println("(1) para inserir um novo construtor");
		println("(2) para listar os cosntrutores atualmente no sistema");
		println("(3) para Editar os construtores atualmente no sistema");
		println("(4) para Excluir um  construtor atualmente no sistema");
		println("Digite sua opção:");
	}

	public static int inserirConstrutor(Construtor construtores[], int numConstrutores, Scanner ler) {

		Construtor cons = new Construtor();
		ler.nextLine();
		print("Nome: ");
		cons.nome = ler.nextLine();
		print("Cpf: ");
		cons.cpf = ler.nextLong();
		ler.nextLine();
		print("Idade: ");
		cons.idade = Integer.parseInt(ler.nextLine());
		print("Naturalidade: ");
		cons.naturalidade = ler.nextLine();

		construtores[numConstrutores] = cons;
		numConstrutores++;

		return numConstrutores;

	}

	public static int editarConstrutor(Construtor construtores[], int numConstrutores, Scanner ler) {

		for (int indexCons = 0; indexCons < numConstrutores; indexCons++) {
			System.out.println(
					"\nnumero: [" + indexCons + "] " + "\tNome do construtor(a) : " + construtores[indexCons].nome);
		}

		println("Para alterar dados de algum  Construtor(a) digite o seu numero ==> [?] ");

		int indexCons = ler.nextInt();

		Construtor cons = construtores[indexCons];

		while (true) { // opções para alterar lista de imoveis

			println("Que informação você quer editar \t Para cancelar operação digite: 0" + "\n1 - Nome" + "\n2 - CPF"
					+ "\n3 - Idade" + "\n4 - Nacionalidade");

			int op = ler.nextInt();

			if (op == 0) {
				println("Operação cancelada!");
				break;
			}

			if (op == 1) {
				ler.nextLine();
				println("Nome a ser alterado: " + construtores[indexCons].nome);
				print("Alterar nome do Construtor para: ");
				cons.nome = ler.nextLine();
				break;
			}

			if (op == 2) {
				println("Cpf a ser alterado: " + construtores[indexCons].cpf);
				print("Alterar idade do Construtor para: ");
				cons.cpf = ler.nextLong();
				break;

			}

			if (op == 3) {
				ler.nextLine();
				println("Idade a ser alterado: " + construtores[indexCons].idade);
				print("Alterar idade do Construtor para: ");
				cons.idade = Integer.parseInt(ler.nextLine());
				break;

			}
			if (op == 4) {
				ler.nextLine();
				println("Naturalidade a ser alterado: " + construtores[indexCons].naturalidade);
				print("Alterar naturalidade do Construtor para: ");
				cons.naturalidade = ler.nextLine();
				break;

			}

		}

		println("\nConstrutor(a) numero: [" + indexCons + "] " + "\tAlterado para Nome: " + construtores[indexCons].nome
				+ "\tcpf: " + construtores[indexCons].cpf + "\tIdade: " + construtores[indexCons].idade
				+ "\tNaturalidade: " + construtores[indexCons].naturalidade + "\n");

		construtores[numConstrutores] = cons;

		return numConstrutores;

	}

	public static int excluirConstrutor(Construtor construtores[], int numConstrutores, Scanner ler) {

		for (int indexCons = 0; indexCons < numConstrutores; indexCons++) {
			System.out.println(
					"\nnumero: [" + indexCons + "] " + "\tNome do construtor(a) : " + construtores[indexCons].nome);
		}

		println("Para excluir algum  Construtor(a) digite o seu numero ==> [?] ");

		int indexCons = ler.nextInt();

		if (indexCons < 0 || indexCons >= numConstrutores) { // verifica se o user colocou um construtor listado
			println("numero invalido, construtor não encontrado tente outro id!");
			return numConstrutores;
		}
		for (int i = indexCons; i < numConstrutores - 1; i++) {
			construtores[i] = construtores[i + 1];
		}
		numConstrutores--;

		return numConstrutores;

	}

	public static void listarConstrutores(Construtor[] construtores, int numConstrutores) { // lista construtores das
																							// obras
		for (int indexCons = 0; indexCons < numConstrutores; indexCons++) {
			println("\nConstrutor(a) numero: [" + indexCons + "] " + "\tNome: " + construtores[indexCons].nome
					+ "\tcpf: " + construtores[indexCons].cpf + "\tIdade: " + construtores[indexCons].idade
					+ "\tNaturalidade: " + construtores[indexCons].naturalidade + "\n");
		}

	}

	public static int inserirImovel(Imovel imoveis[], int numImoveis, Construtor construtores[], int numConstrutores,
			Scanner ler) { // inserir novo imovel
		Imovel imo = new Imovel();
		ler.nextLine();
		print("Nome: ");
		imo.nome = ler.nextLine();
		print("Tipo: ");
		imo.tipo = ler.nextLine();
		print("Area construida: ");
		imo.area = Integer.parseInt(ler.nextLine());
		print("Localidade do Imovel: ");
		imo.localConstrucao = ler.nextLine();
		print("Ano de Construção: ");
		imo.anoConstrução = Integer.parseInt(ler.nextLine());

		for (int indexCons = 0; indexCons < numConstrutores; indexCons++) {
			System.out.println(
					"\nnumero: [" + indexCons + "] " + "\tNome do construtor(a) : " + construtores[indexCons].nome);
		}

		print("\nDigite o numero do construtor(a) do imóvel: ");

		int indexCons = ler.nextInt();
		imo.construtor = construtores[indexCons];

		imoveis[numImoveis] = imo;
		numImoveis++;
		return numImoveis;

	}

	public static void listarImoveis(Imovel[] imoveis, int numImoveis) {
		for (int indexImo = 0; indexImo < numImoveis; indexImo++) {
			println("\nImovel numero: [" + indexImo + "] " + "\tNome: " + imoveis[indexImo].nome + "\tTipo: "
					+ imoveis[indexImo].tipo + "\tArea construida em m²: " + imoveis[indexImo].area
					+ "\tLocal da construção: " + imoveis[indexImo].localConstrucao + "\tAno de construção : "
					+ imoveis[indexImo].anoConstrução + "\nConstrutor: " + imoveis[indexImo].construtor.nome + "\n");
		}

	}

	public static int editarImovel(Imovel imoveis[], int numImoveis, Scanner ler) {

		for (int indexImo = 0; indexImo < numImoveis; indexImo++) {
			System.out.println("\nnumero: [" + indexImo + "] " + "\tNome do Imovel : " + imoveis[indexImo].nome);
		}

		println("Para alterar nome  do Imovel digite o seu numero ==> [?] ");

		int indexImo = ler.nextInt();

		if (indexImo < 0 || indexImo >= numImoveis) { // verifica se o user colocou um imovel listado
			System.out.println("Id invalido, filme não encontrado tente outro id!");
			return numImoveis;
		}

		Imovel imo = imoveis[indexImo];

		while (true) { // opções para alterar lista de imoveis

			println("Que informação você quer editar \t Para cancelar operação digite: 0" + "\n1 - Nome" + "\n2 - Tipo"
					+ "\n3 - Area" + "\n4 - Local da Construção" + "\n5 - Ano Construção"
					+ "\n6 - Construtor do Imovel");

			int op = ler.nextInt();

			if (op == 0) {
				println("Operação cancelada!");
				break;
			}

			if (op == 1) {
				ler.nextLine();
				println("Nome a ser alterado: " + imoveis[indexImo].nome);
				print("Novo nome: ");
				imo.nome = ler.nextLine();
				break;
			}

			if (op == 2) {
				ler.nextLine();
				println("Tipo a ser alterado: " + imoveis[indexImo].tipo);
				print("Novo Tipo: ");
				imo.tipo = ler.nextLine();
				break;

			}

			if (op == 3) {
				ler.nextLine();
				println("Area a ser alterada: " + imoveis[indexImo].area);
				print("Novo valor da area construida: ");
				imo.area = Integer.parseInt(ler.nextLine());
				break;

			}
			if (op == 4) {
				ler.nextLine();
				println("Nome da localidade a ser alterada: " + imoveis[indexImo].localConstrucao);
				print("Nova localidade do Imovel: ");
				imo.localConstrucao = ler.nextLine();
				break;

			}

			if (op == 5) {
				println("Ano de construção  a ser alterado: " + imoveis[indexImo].anoConstrução);
				print("Novo Ano de Construção: ");
				ler.nextLine();
				imo.anoConstrução = Integer.parseInt(ler.nextLine());
				break;

			}

			if (op == 6) {

				println("\nConstrutor a ser alterado: " + imoveis[indexImo].construtor.nome + "\n");

				println("Lista de Construtores cadastrados:  ---------------------------------------------------------------");
				for (int indexCons = 0; indexCons < numConstrutores; indexCons++) {
					println("\nnumero: [" + indexCons + "] " + "\tNome do construtor(a) : "
							+ construtores[indexCons].nome);
				}
				println("---------------------------------------------------------------------------------------------------");

				print("\nDigite o novo numero do construtor(a) do imóvel para alterar: ");

				int indexCons = ler.nextInt();
				imo.construtor = construtores[indexCons];

				println("\nConstrutor do Imovel numero: [" + indexImo + "] " + "\tNome: " + imoveis[indexImo].nome
						+ "\nalterado para: " + imoveis[indexImo].construtor.nome + "\n");
				break;

			}

		}

		imoveis[numImoveis] = imo;

		return numImoveis;

	}

	public static int excluirImovel(Imovel imoveis[], int numImoveis, Scanner ler) {

		for (int indexImo = 0; indexImo < numImoveis; indexImo++) {
			println("\nnumero: [" + indexImo + "] " + "\tNome do Imovel : " + imoveis[indexImo].nome);
		}

		println("Para excluir um  Imovel digite o seu numero ==> [?] ");

		int indexImo = ler.nextInt();

		if (indexImo < 0 || indexImo >= numImoveis) { // verifica se o user colocou um imovel listado
			System.out.println("numero invalido, imovel não encontrado tente outro id!");
			return numImoveis;
		}
		for (int i = indexImo; i < numImoveis - 1; i++) {
			imoveis[i] = imoveis[i + 1];
		}

//		Imovel imo = imoveis[indexImo];
//		imoveis[numImoveis] = imo;
		numImoveis--;

		return numImoveis;

	}

	public static int iniciarVetorConstrutores(Construtor construtores[], int numConstrutores) {

		Construtor cons = new Construtor();
		cons.nome = "Não especificado";
		cons.cpf = 11111111111L;
		cons.idade = 0;
		cons.naturalidade = " ";

		construtores[numConstrutores] = cons;
		numConstrutores++;

		cons = new Construtor();
		cons.nome = "Douglas de Lara";
		cons.cpf = Long.parseLong("33333333333");
		cons.idade = 55;
		cons.naturalidade = "Canoinhence";

		construtores[numConstrutores] = cons;
		numConstrutores++;

		cons = new Construtor();
		cons.nome = "Elenita Zaluski Kelczeski";
		cons.cpf = Long.parseLong("22222222222");
		cons.idade = 35;
		cons.naturalidade = "Mafrense";

		construtores[numConstrutores] = cons;
		numConstrutores++;

		return numConstrutores;

	}

	public static int iniciarVetorImoveisConstrucoes(Construtor construtores[], Imovel imoveis[], int numImoveis) {

		Imovel imo = new Imovel();
		imo.nome = "Residencial Boa Vista";
		imo.tipo = "Condominio";
		imo.area = 1000;
		imo.localConstrucao = "Tres Barras Alto do Mussi";
		imo.anoConstrução = 1995;
		imo.construtor = construtores[1];

		imoveis[numImoveis] = imo;
		numImoveis++;

		imo = new Imovel();
		imo.nome = "Bartman";
		imo.tipo = "Barzinho Comercial";
		imo.area = 100;
		imo.localConstrucao = "Morro do café, Rio de Janeiro";
		imo.anoConstrução = 1989;
		imo.construtor = construtores[0];

		imoveis[numImoveis] = imo;
		numImoveis++;

		imo = new Imovel();
		imo.nome = "Casa 615";
		imo.tipo = "Minha casa minha vida";
		imo.area = 200;
		imo.localConstrucao = "Morro da saudade Mafra-SC";
		imo.anoConstrução = 2010;
		imo.construtor = construtores[2];

		imoveis[numImoveis] = imo;
		numImoveis++;

		return numImoveis;

	}

	static void println(String conteudo) { // imprime um print com quebra
		if (imprime)
			System.out.println(conteudo);

	}

	static void print(String conteudo) { // imprime um print sem quebra

		if (imprimeSemQuebra)
			System.out.print(conteudo);

	}

}
