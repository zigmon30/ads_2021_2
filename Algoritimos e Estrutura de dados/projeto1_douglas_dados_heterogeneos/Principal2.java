package projeto1_douglas_dados_heterogeneos;

import java.util.Scanner;

public class Principal2 {
	static boolean imprime = true;
	static boolean imprimeSemQuebra = true;
	static int MAX_IMOVEIS = 999;
	static int MAX_COSNTRUTORES = 999;

	static Imovel imoveis[] = new Imovel[MAX_IMOVEIS];
	static Construtor construtores[] = new Construtor[MAX_COSNTRUTORES];

	static int numImoveis = 0;
	static int numConstrutores = 0;

	public static void main(String[] args) {
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
							System.out.println("\nnumero: [" + indexCons + "] " + "\tNome do construtor(a) : "
									+ construtores[indexCons].nome);
						}
						
						print("Digite o numero do construtor(a) do imóvel: ");
						
						int indexCons = ler.nextInt();
						imo.construtor = construtores[indexCons];

						imoveis[numImoveis] = imo;
						numImoveis++;
					}

					if (opecaoImo == 2) {
						for (int indexImo = 0; indexImo < numImoveis; indexImo++) {
							System.out.println("\nImovel numero: [" + indexImo + "] " + "\tNome: "
									+ imoveis[indexImo].nome + "\tTipo: " + imoveis[indexImo].tipo
									+ "\tArea construida em m²: " + imoveis[indexImo].area + "\tLocal da construção: "
									+ imoveis[indexImo].localConstrucao + "\tAno de construção : "
									+ imoveis[indexImo].anoConstrução + "\nConstrutor: "
									+ imoveis[indexImo].construtor.nome + "\n");
						}
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

						Construtor cons = new Construtor();
						ler.nextLine();
						print("NOme: ");
						cons.nome = ler.nextLine();
						print("Cpf: ");
						cons.cpf = Integer.parseInt(ler.nextLine());
						print("Idade: ");
						cons.idade = Integer.parseInt(ler.nextLine());
						print("Naturalidade: ");
						cons.naturalidade = ler.nextLine();

						construtores[numConstrutores] = cons;
						numConstrutores++;
					}

					if (opecaoCon == 2) {
						for (int indexCons = 0; indexCons < numConstrutores; indexCons++) {
							System.out.println("\nConstrutor(a) numero: [" + indexCons + "] " + "\tNome: "
									+ construtores[indexCons].nome + "\tcpf: " + construtores[indexCons].cpf
									+ "\tIdade: " + construtores[indexCons].idade + "\tNaturalidade: "
									+ construtores[indexCons].naturalidade + "\n");
						}
					}

				}

			}
		}

	}

	static void menu() {
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

	static void menuImoveis() {
		println("");
		println("---------------------");
		println("(0) para Voltar ao Menu Principal");
		println("(1) para inserir um novo Imovel");
		println("(2) para listar os Imoveis atualmente no sistema");
		println("(3) para Editar os Imoveis atualmente no sistema");
		println("Digite sua opção:");
	}

	static void menuConstrutures() {
		println("");
		println("---------------------");
		println("(0) para Voltar ao Menu Principal");
		println("(1) para inserir um novo construtor");
		println("(2) para listar os cosntrutores atualmente no sistema");
		println("(3) para Editar os construtores atualmente no sistema");
		println("Digite sua opção:");
	}

	static void println(String conteudo) {
		if (imprime)
			System.out.println(conteudo);

	}
	
	static void print(String conteudo) {

		if (imprimeSemQuebra)
			System.out.print(conteudo);

	}
	
	

}
