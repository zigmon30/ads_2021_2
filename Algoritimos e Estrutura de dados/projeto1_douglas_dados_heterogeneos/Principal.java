package projeto1_douglas_dados_heterogeneos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Imovel imoveis[] = new Imovel[3];

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o imovel:" + i);
			imoveis[i] = new Imovel();
			imoveis[i].nome = entrada.nextLine();
			imoveis[i].tipo = entrada.nextLine();
			imoveis[i].area = Integer.parseInt(entrada.nextLine());
			imoveis[i].localConstrucao = entrada.nextLine();
			imoveis[i].anoConstrução = Integer.parseInt(entrada.nextLine());
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Imovel" + imoveis[i] + "\tNome: " + imoveis[i].nome + "\tTipo: " + imoveis[i].tipo
					+ "\tArea construida em m²: " + imoveis[i].area + "\tLocal da construção: "
					+ imoveis[i].localConstrucao + "\tAno de construção : " + imoveis[i].anoConstrução);
		}

	}

}
