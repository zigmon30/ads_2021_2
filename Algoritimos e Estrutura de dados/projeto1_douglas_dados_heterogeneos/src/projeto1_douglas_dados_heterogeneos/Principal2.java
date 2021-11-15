package projeto1_douglas_dados_heterogeneos;

import java.util.Scanner;

public class Principal2 {
	static boolean imprime = true;

	static Imovel imoveis[] = new Imovel[999];
	static Construtor construtores[] = new Construtor[999];

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
						imo.nome = ler.nextLine();
						imo.tipo = ler.nextLine();
						imo.area = Integer.parseInt(ler.nextLine());
						imo.localConstrucao = ler.nextLine();
						imo.anoConstrução = Integer.parseInt(ler.nextLine());

						imoveis[numImoveis] = imo;
						numImoveis++;
					}

					if (opecaoImo == 2) {
						for (int indexImo = 0; indexImo < numImoveis; indexImo++) {
							System.out.println("\nImovel " + imoveis[indexImo] + "\tNome: " + imoveis[indexImo].nome
									+ "\tTipo: " + imoveis[indexImo].tipo + "\tArea construida em m²: "
									+ imoveis[indexImo].area + "\nLocal da construção: "
									+ imoveis[indexImo].localConstrucao + "\tAno de construção : "
									+ imoveis[indexImo].anoConstrução + "\n");
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
						cons.nome = ler.nextLine();
						cons.cpf = Integer.parseInt(ler.nextLine());
						
						cons.idade = Integer.parseInt(ler.nextLine());
						cons.naturalidade = ler.nextLine();

						construtores[numConstrutores] = cons;
						numConstrutores++;
					}

					if (opecaoCon == 2) {
						for (int indexCons = 0; indexCons < numConstrutores; indexCons++) {
							System.out.println("\nConstrutor(a) " + construtores[indexCons] + "\tNome: " + construtores[indexCons].nome
									+ "\tcpf: " + construtores[indexCons].cpf + "\tIdade: "
									+ construtores[indexCons].idade + "\nNaturalidade: "
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
		println("(2) para Editar os Imoveis atualmente no sistema");
		println("Digite sua opção:");
	}

	static void menuConstrutures() {
		println("");
		println("---------------------");
		println("(0) para Voltar ao Menu Principal");
		println("(1) para inserir um novo cosntrutor");
		println("(2) para listar os cosntrutures atualmente no sistema");
		println("Digite sua opção:");
	}

	static void println(String conteudo) {
		if (imprime)
			System.out.println(conteudo);

	}

}
