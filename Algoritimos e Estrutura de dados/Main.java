package aed_projeto_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int MAX_DIRETORES = 30;
		int MAX_FILMES = 50;
		
		Diretor diretores[] = new Diretor[MAX_DIRETORES];
		int numDiretores = 0;
		
		Filme filmes[] = new Filme[MAX_FILMES];
		int numFilmes = 0;		
		
		
		numDiretores = iniciarVetorDiretores(diretores, numDiretores);
		numFilmes = iniciarVetorFilmes(filmes, diretores, numFilmes);
		
		int opcao = 1;
		Scanner input = new Scanner(System.in);
		
		while(opcao != 0) {
			System.out.println("Digite:"
					+ "\n0 para sair"
					+ "\n1 para cadastrar novo Diretor"
					+ "\n2 para listar todos os diretores cadastrados"
					+ "\n3 para cadastrar novo Filme"
					+ "\n4 para listar todos os filmes cadastrados");
			//Editar um filme
			//Editar um diretor
			
			opcao = Integer.valueOf(input.nextLine());
			
			if(opcao == 0) {
				break;
			}
			
			if(opcao == 1) {
				numDiretores = inserirDiretor(diretores, numDiretores, input);
			}
			
			if(opcao == 2) {
				listarDiretores(diretores, numDiretores);
			}
			
			if(opcao == 3) {
				numFilmes = inserirFilme(filmes, numFilmes, diretores, numDiretores, input);
			}
			
			if(opcao == 4) {
				listarFilmes(filmes, numFilmes);
			}
		}		
	}
	
	public static int iniciarVetorDiretores(
			Diretor diretores[], 
			int numDiretores) {
		
		Diretor d;
		
		d = new Diretor();
		d.id = 0;
		d.nome = "Peter Jackson";
		d.anoNasc = 1961;
		d.nacionalidade = "Nova Zelandia";
		
		diretores[numDiretores] = d;
		numDiretores++;
		
		d = new Diretor();
		d.id = 1;
		d.nome = "Steven Spielberg";
		d.anoNasc = 1946;
		d.nacionalidade = "Estados Unidos";
		
		diretores[numDiretores] = d;
		numDiretores++;
		
		
		d = new Diretor();
		d.id = 2;
		d.nome = "Quentin Tarantino";
		d.anoNasc = 1963;
		d.nacionalidade = "Estados Unidos";
		
		diretores[numDiretores] = d;
		numDiretores++;
		
		return numDiretores;
	}

	public static int iniciarVetorFilmes(
			Filme filmes[], 
			Diretor diretores[], 
			int numFilmes) {
		
		Filme f = new Filme();
		f.id = numFilmes;
		f.titulo = "The Lord of the Rings: The Fellowship of the Ring";
		f.anoLan = 2001;
		f.duracao = 178;
		f.genero = "Aventura";
		f.diretor = diretores[0];	
		
		filmes[numFilmes] = f;
		numFilmes++;
		
		f = new Filme();
		f.id = numFilmes;
		f.titulo = "King Kong";
		f.anoLan = 2005;
		f.duracao = 187;
		f.genero = "Ação";
		f.diretor = diretores[0];
		
		filmes[numFilmes] = f;
		numFilmes++;
		
		f = new Filme();
		f.id = numFilmes;
		f.titulo = "The Hobbit: An Unexpected Journey";
		f.anoLan = 2012;
		f.duracao = 169;
		f.genero = "Fantasia";
		f.diretor = diretores[0];
		
		filmes[numFilmes] = f;
		numFilmes++;
		
		f = new Filme();
		f.id = numFilmes;
		f.titulo = "Jurassic Park";
		f.anoLan = 1993;
		f.duracao = 127;
		f.genero = "Ação";
		f.diretor = diretores[1];
		
		filmes[numFilmes] = f;
		numFilmes++;
		
		f = new Filme();
		f.id = numFilmes;
		f.titulo = "Saving Private Ryan";
		f.anoLan = 1998;
		f.duracao = 169;
		f.genero = "Guerra";
		f.diretor = diretores[1];
		
		filmes[numFilmes] = f;
		numFilmes++;
		
		return numFilmes;
	}
	
	public static int inserirDiretor(
			Diretor diretores[], 
			int numDiretores, 
			Scanner input) {
		
		Diretor novoDiretor = new Diretor();
		novoDiretor.id = numDiretores;
		System.out.print("Digite o nome do diretor: ");
		novoDiretor.nome = input.nextLine();
		System.out.print("Digite o ano de nascimento do diretor: ");
		novoDiretor.anoNasc = Integer.valueOf(input.nextLine());
		System.out.print("Digite o pais de origem do diretor: ");
		novoDiretor.nacionalidade = input.nextLine();
		diretores[numDiretores] = novoDiretor;
		numDiretores++;
		return numDiretores;
	}

	public static void listarDiretores(
			Diretor[] diretores, 
			int numDiretores) {
		
		for(int i=0; i<numDiretores; i++) {
			System.out.println(
					"id: " + diretores[i].id
					+", nome = " + diretores[i].nome
					+", ano de nascimento: " + diretores[i].anoNasc
					+", nacionalidade: "+diretores[i].nacionalidade);
		}
	}

	public static int inserirFilme(
			Filme filmes[], 
			int numFilmes, 
			Diretor diretores[], 
			int numDiretores,
			Scanner input) {
		
		Filme novoFilme = new Filme();
		novoFilme.id = numFilmes;
		System.out.print("Digite o titulo do filme: ");
		novoFilme.titulo = input.nextLine();
		System.out.print("Digite o ano de lançamento do filme: ");
		novoFilme.anoLan = Integer.valueOf(input.nextLine());
		System.out.print("Digite o genero do filme: ");
		novoFilme.genero = input.nextLine();
		System.out.print("Digite a duração do filme (em minutos): ");
		novoFilme.duracao = Integer.valueOf(input.nextLine());
		
		
		for(int i=0; i<numDiretores; i++) {
			System.out.println(
					"id: " + diretores[i].id
					+ ", nome: "+diretores[i].nome);
		}
		System.out.print("Digite o id de um dos diretores acima para selecionar o diretor do filme: ");
		int idDiretor = Integer.valueOf(input.nextLine());
		novoFilme.diretor = diretores[idDiretor];
		
		filmes[numFilmes] = novoFilme;
		numFilmes++;
		return numFilmes;
		
	}
	
	public static void listarFilmes(
			Filme filmes[], 
			int numFilmes) {
		
		for(int i=0; i< numFilmes; i++) {
			System.out.println(
					"id: "+filmes[i].id
					+", titulo: "+filmes[i].titulo
					+", ano de lançamento: "+filmes[i].anoLan
					+", duração: "+filmes[i].duracao
					+", genero: "+filmes[i].genero
					+", diretor: "+filmes[i].diretor.nome);
		}
	}

	
}
