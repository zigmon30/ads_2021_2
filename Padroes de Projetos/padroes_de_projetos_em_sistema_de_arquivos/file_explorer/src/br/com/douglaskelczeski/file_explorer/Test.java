package br.com.douglaskelczeski.file_explorer;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.douglaskelczeski.file_explorer.entidades.Audio;
import br.com.douglaskelczeski.file_explorer.entidades.Dispositivo;
import br.com.douglaskelczeski.file_explorer.entidades.DispositivoFactory;
import br.com.douglaskelczeski.file_explorer.entidades.Documento;
import br.com.douglaskelczeski.file_explorer.entidades.FabricanteDispositivoArmazenamento;
import br.com.douglaskelczeski.file_explorer.entidades.ImagemLivre;
import br.com.douglaskelczeski.file_explorer.entidades.ImagemPrivada;
import br.com.douglaskelczeski.file_explorer.entidades.TamanhoArmazenamento;
import br.com.douglaskelczeski.file_explorer.entidades.TipoDispositivoCapacidade;
import br.com.douglaskelczeski.file_explorer.entidades.TodosOsArquivos;
import br.com.douglaskelczeski.file_explorer.entidades.VideoLivre;
import br.com.douglaskelczeski.file_explorer.entidades.VideoPrivado;

public class Test {

	static boolean imprime = true; // ################################################
	static ArrayList<TodosOsArquivos> all = new ArrayList<TodosOsArquivos>();
	static ArrayList<Dispositivo> dispositivos = new ArrayList<Dispositivo>();
	static ArrayList<FabricanteDispositivoArmazenamento> fabricantes = new ArrayList<FabricanteDispositivoArmazenamento>();
	static ArrayList<Audio> audios = new ArrayList<Audio>(); // LISTAS DINAMICAS COM ARRAYLIST
	static ArrayList<Documento> textos = new ArrayList<Documento>();
	static ArrayList<ImagemLivre> imagens = new ArrayList<ImagemLivre>();
	static ArrayList<ImagemPrivada> imagensp = new ArrayList<ImagemPrivada>();
	static ArrayList<VideoLivre> videos = new ArrayList<VideoLivre>();
	static ArrayList<VideoPrivado> videosp = new ArrayList<VideoPrivado>();
	

	// ################################################

	public static void main(String[] args) {
		FabricanteDispositivoArmazenamento fabri = new FabricanteDispositivoArmazenamento();
		fabri.setNomeDispositivo("Toshiba");
		fabri.setModelo("Canvio Basics HDTB410XK3AA");
		fabricantes.add(fabri);

		FabricanteDispositivoArmazenamento fabri1 = new FabricanteDispositivoArmazenamento();
		fabri1.setNomeDispositivo("Western Digital");
		fabri1.setModelo("My Passport");
		fabricantes.add(fabri1);
		
		FabricanteDispositivoArmazenamento fabri2 = new FabricanteDispositivoArmazenamento();
		fabri2.setNomeDispositivo("Seagate");
		fabri2.setModelo("Barracuda");
		fabricantes.add(fabri2);
		
		
		Dispositivo dis1 = DispositivoFactory.criarDispositivo("Cliente", 1024, 321, fabri);
		dispositivos.add(dis1);
		Dispositivo dis2 = DispositivoFactory.criarDispositivo("Backup cliente", 500, 250, null);
		dispositivos.add(dis2);
		
		
		

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
					menuDispositivo();

					int opecaoDis = ler.nextInt();

					if (opecaoDis == 0) {
						break;
					}

					if (opecaoDis == 1) {

						println("Nome do dispositivo de armazenamento: ");
						String nome = ler.next();

						for (int indexFab = 0; indexFab < fabricantes.size(); indexFab++) {
							println("Fabricante[" + indexFab + "]: " + fabricantes.get(indexFab).getNomeDispositivo()
									+ "\tModelo...=> " + fabricantes.get(indexFab).getModelo());
						}
						println("Qual a Marca e modelo insira o indice do dispositivo de armazenamento: ");
						int indexFab = ler.nextInt();
						FabricanteDispositivoArmazenamento fab = fabricantes.get(indexFab);

						println("Qual o codigo da capacidade:\n" + "(1)  (2)  (3)");
						int opcaoTipoDis = ler.nextInt();
						TipoDispositivoCapacidade tipoDispositivo = TipoDispositivoCapacidade.values()[opcaoTipoDis
								- 1];

						TamanhoArmazenamento armazenamento = tipoDispositivo.obterCapacidade();
						double capacidade = armazenamento.escolherTamanho();
						System.out.println();

						// double capacidade = ler.nextDouble();
						println("Capacidade utilizada do dispositivo de armazenamento: ");
						double capacidadeUsada = ler.nextDouble();
						Dispositivo dis = DispositivoFactory.criarDispositivo(nome, capacidade, capacidadeUsada, fab);
						dispositivos.add(dis);

					}

					if (opecaoDis == 2) {
						for (int indexDis = 0; indexDis < dispositivos.size(); indexDis++) {
							println("Dispositivo[" + indexDis + "]: " + dispositivos.get(indexDis).getNome()
									+ " Capacidade...=> " + dispositivos.get(indexDis).getCapacidade()
									+ " Memoria usada...=> " + +dispositivos.get(indexDis).getCapacidadeUsada()
									+ " Capacidade restante...=>" + dispositivos.get(indexDis).getCapacidadeRestante()
									+ "\nFabricante...=> " + dispositivos.get(indexDis).getFabricante().getNomeDispositivo()
									+ " Modelo...=> " + dispositivos.get(indexDis).getFabricante().getModelo()
									+ "\n");
							println("------------------------------------------------------------------");
						}
					}

					if (opecaoDis == 3) {
						println("Para alterar nome  do dispositivo digite o seu id ");
						int indexDis = ler.nextInt();

						if (indexDis < dispositivos.size()) {
							Dispositivo dis = dispositivos.get(indexDis);
							println("Digite um novo nome para: " + dis.getNome() + "?");
							String nome = ler.next();
							dis.setNome(nome);
							println("Nome alterado com sucesso");
						} else {
							println("Indice n??o encontrado");
						}

					}

					if (opecaoDis == 4) {
						println("Digite o id do dispositivo para ser removido");
						int indexDis = ler.nextInt();

						if (indexDis < dispositivos.size()) {
							dispositivos.remove(indexDis);
							println("Dispositivo  removido com sucesso");
						} else {
							println("Indice n??o encontrado");
						}

					}

				}

			}

			if (opecao == 2) {
				while (true) {
					menuAudio();

					int opecaoDis = ler.nextInt();

					if (opecaoDis == 0) {
						break;
					}

					if (opecaoDis == 1) {

						println("Nome do arquivo  de musica: ");
						String nome = ler.next();

						println("Formato do arquivo: ");
						String formato = ler.next();
						println("tamanho do arquivo: ");
						double tamanho = ler.nextDouble();
						Audio aud = new Audio(nome, formato, tamanho);

						audios.add(aud);

					}

					if (opecaoDis == 2) {
						for (int indexDis = 0; indexDis < audios.size(); indexDis++) {
							println("Audio[" + indexDis + "]: " + audios.get(indexDis).getNome() + " Formato...=> "
									+ audios.get(indexDis).getFormatarAudio() + " Tamanho do arquivo...=> "
									+ +audios.get(indexDis).getTamanho() + "\n");
							println("------------------------------------------------------------------");
						}
					}

					if (opecaoDis == 3) {
						println("Para alterar nome  do audio digite o seu id ");
						int indexAud = ler.nextInt();

						if (indexAud < audios.size()) {
							Audio aud = audios.get(indexAud);
							println("Digite um novo nome para: " + aud.getNome() + "?");
							String nome = ler.next();
							aud.setNome(nome);
							println("Nome alterado com sucesso");
						} else {
							println("Indice n??o encontrado");
						}

					}

					if (opecaoDis == 4) {
						println("Digite o id do dispositivo para ser removido");
						int indexAud = ler.nextInt();

						if (indexAud < audios.size()) {
							audios.remove(indexAud);
							println("Arquivo de audio  removido com sucesso");
						} else {
							println("Indice de audio n??o encontrado");
						}

					}

				}

			}

			if (opecao == 3) {
				while (true) {
					menuDocumentoDeTexto();

					int opecaoDis = ler.nextInt();

					if (opecaoDis == 0) {
						break;
					}

					if (opecaoDis == 1) {

						println("Nome do arquivo  de texto: ");
						String nome = ler.next();

						println("Formato do arquivo: ");
						String formato = ler.next();
						println("tamanho do arquivo: ");
						double tamanho = ler.nextDouble();
						Documento aud = new Documento(nome, formato, tamanho);

						textos.add(aud);

					}

					if (opecaoDis == 2) {
						for (int indexDis = 0; indexDis < textos.size(); indexDis++) {
							println("Documento[" + indexDis + "]: " + textos.get(indexDis).getNome() + " Formato...=> "
									+ textos.get(indexDis).getFormatarDocumento() + " Tamanho do arquivo...=> "
									+ +textos.get(indexDis).getTamanho() + "\n");
							println("------------------------------------------------------------------");
						}
					}

					if (opecaoDis == 3) {
						println("Para alterar nome  do arquivo de texto digite o seu id ");
						int indexTex = ler.nextInt();

						if (indexTex < textos.size()) {
							Documento doc = textos.get(indexTex);
							println("Digite um novo nome para: " + doc.getNome() + "?");
							String nome = ler.next();
							doc.setNome(nome);
							println("Nome do documento de texto alterado com sucesso");
						} else {
							println("Indice do documento n??o encontrado");
						}

					}

					if (opecaoDis == 4) {
						println("Digite o id do dispositivo para ser removido");
						int indexTxt = ler.nextInt();

						if (indexTxt < textos.size()) {
							textos.remove(indexTxt);
							println("Arquivo de texto  removido com sucesso");
						} else {
							println("Indice de texto n??o encontrado");
						}

					}

				}

			}
			if (opecao == 4) {
				while (true) {
					menuImagem();

					int opecaoDis = ler.nextInt();

					if (opecaoDis == 0) {
						break;
					}

					if (opecaoDis == 1) {

						println("Nome do arquivo  de imagem: ");
						String nome = ler.next();

						println("Formato do arquivo: ");
						String formato = ler.next();
						println("tamanho do arquivo: ");
						double tamanho = ler.nextDouble();
						ImagemLivre img = new ImagemLivre(nome, formato, tamanho);

						imagens.add(img);

					}

					if (opecaoDis == 2) {
						for (int indexDis = 0; indexDis < imagens.size(); indexDis++) {
							println("Imagem[" + indexDis + "]: " + imagens.get(indexDis).getNome() + " Formato...=> "
									+ imagens.get(indexDis).getFormatarImagem() + " Tamanho do arquivo...=> "
									+ imagens.get(indexDis).getTamanho() + " " + imagens.get(indexDis).getType()
									+ "\n");
							println("------------------------------------------------------------------");
						}
					}

					if (opecaoDis == 3) {
						println("Para alterar nome  do arquivo de imagem digite o seu id ");
						int indexImg = ler.nextInt();

						if (indexImg < imagens.size()) {
							ImagemLivre img = imagens.get(indexImg);
							println("Digite um novo nome para: " + img.getNome() + "?");
							String nome = ler.next();
							img.setNome(nome);
							println("Nome do documento de imagem alterado com sucesso");
						} else {
							println("Indice da imagem n??o encontrado");
						}

					}

					if (opecaoDis == 4) {
						println("Digite o id da imagem para ser removido");
						int indexImg = ler.nextInt();

						if (indexImg < imagens.size()) {
							imagens.remove(indexImg);
							println("Arquivo de imagem  removido com sucesso");
						} else {
							println("Indice de imagem n??o encontrado");
						}

					}

				}

			}
			if (opecao == 41) {
				while (true) {
					menuImagem();

					int opecaoDis = ler.nextInt();

					if (opecaoDis == 0) {
						break;
					}

					if (opecaoDis == 1) {

						println("Nome do arquivo  de imagem: ");
						String nome = ler.next();
						println("Senha do arquivo: ");
						double senha = ler.nextDouble();
						println("Formato do arquivo: ");
						String formato = ler.next();
						println("tamanho do arquivo: ");
						double tamanho = ler.nextDouble();
						ImagemPrivada img = new ImagemPrivada(nome, formato, tamanho, senha);

						imagensp.add(img);

					}

					if (opecaoDis == 2) {
						for (int indexDis = 0; indexDis < imagensp.size(); indexDis++) {
							println("Imagem[" + indexDis + "]: " + imagensp.get(indexDis).getNome() + " Formato...=> "
									+ imagensp.get(indexDis).getFormatarImagem() + " Tamanho do arquivo...=> "
									+ imagensp.get(indexDis).getTamanho() + " " + imagensp.get(indexDis).getType()
									+ "\n");
							println("------------------------------------------------------------------");
						}
					}

					if (opecaoDis == 3) {
						println("Para alterar nome  do arquivo de imagem digite o seu id ");
						int indexImg = ler.nextInt();

						if (indexImg < imagensp.size()) {
							ImagemPrivada img = imagensp.get(indexImg);
							println("Digite um novo nome para: " + img.getNome() + "?");
							String nome = ler.next();
							img.setNome(nome);
							println("Nome do documento de imagem alterado com sucesso");
						} else {
							println("Indice da imagem n??o encontrado");
						}

					}

					if (opecaoDis == 4) {
						println("Digite o id da imagem para ser removido");
						int indexImg = ler.nextInt();

						if (indexImg < imagensp.size()) {
							imagensp.remove(indexImg);
							println("Arquivo de imagem  removido com sucesso");
						} else {
							println("Indice de imagem n??o encontrado");
						}

					}

				}

			}
			if (opecao == 5) {
				while (true) {
					menuVideo();

					int opecaoDis = ler.nextInt();

					if (opecaoDis == 0) {
						break;
					}

					if (opecaoDis == 1) {

						println("Nome do arquivo  de video: ");
						String nome = ler.next();

						println("Formato do arquivo: ");
						String formato = ler.next();
						println("tamanho do arquivo: ");
						double tamanho = ler.nextDouble();
						VideoLivre vid = new VideoLivre(nome, formato, tamanho);

						videos.add(vid);
						println("Arquivo  de video adicionado com sucesso: ");

					}

					if (opecaoDis == 2) {
						for (int indexDis = 0; indexDis < videos.size(); indexDis++) {
							println("Video[" + indexDis + "]: " + videos.get(indexDis).getNome() + " Formato...=> "
									+ videos.get(indexDis).getFormatarVideo() + " Tamanho do arquivo...=> "
									+ +videos.get(indexDis).getTamanho() + " " + videos.get(indexDis).getType() + "\n");
							println("------------------------------------------------------------------");
						}
					}

					if (opecaoDis == 3) {
						println("Para alterar nome  do arquivo de video digite o seu id ");
						int indexTex = ler.nextInt();

						if (indexTex < videos.size()) {
							VideoLivre vid = videos.get(indexTex);
							println("Digite um novo nome para: " + vid.getNome() + "?");
							String nome = ler.next();
							vid.setNome(nome);
							println("Nome do documento de video alterado com sucesso");
						} else {
							println("Indice do video n??o encontrado");
						}

					}

					if (opecaoDis == 4) {
						println("Digite o id do video para ser removido");
						int indexVid = ler.nextInt();

						if (indexVid < videos.size()) {
							videos.remove(indexVid);
							println("Arquivo de video  removido com sucesso");
						} else {
							println("Indice do video n??o encontrado");
						}

					}

				}

			}
			if (opecao == 51) {
				while (true) {
					menuVideo();

					int opecaoDis = ler.nextInt();

					if (opecaoDis == 0) {
						break;
					}

					if (opecaoDis == 1) {

						println("Nome do arquivo  de video: ");
						String nome = ler.next();
						println("Senha do arquivo: ");
						double senha = ler.nextDouble();
						println("Formato do arquivo: ");
						String formato = ler.next();

						println("tamanho do arquivo: ");
						double tamanho = ler.nextDouble();
						VideoPrivado vid = new VideoPrivado(nome, formato, tamanho, senha);

						videosp.add(vid);
						println("Arquivo  de video privado adicionado com sucesso: ");

					}

					if (opecaoDis == 2) {
						for (int indexDis = 0; indexDis < videosp.size(); indexDis++) {
							println("Video[" + indexDis + "]: " + videosp.get(indexDis).getNome() + " Formato...=> "
									+ videosp.get(indexDis).getFormatarVideo() + " Tamanho do arquivo...=> "
									+ +videosp.get(indexDis).getTamanho() + " " + videosp.get(indexDis).getType()
									+ "\n");
							println("------------------------------------------------------------------");
						}
					}

					if (opecaoDis == 3) {
						println("Para alterar nome  do arquivo de video digite o seu id ");
						int indexTex = ler.nextInt();

						if (indexTex < videosp.size()) {
							VideoPrivado vid = videosp.get(indexTex);
							println("Digite um novo nome para: " + vid.getNome() + "?");
							String nome = ler.next();
							vid.setNome(nome);
							println("Nome do documento de video alterado com sucesso");
						} else {
							println("Indice do video n??o encontrado");
						}

					}

					if (opecaoDis == 4) {
						println("Digite o id do video para ser removido");
						int indexVid = ler.nextInt();

						if (indexVid < videos.size()) {
							videos.remove(indexVid);
							println("Arquivo de video Privado removido com sucesso");
						} else {
							println("Indice do video n??o encontrado");
						}

					}

				}

			}

			if (opecao == 99) {
				while (true) {
					menuMostrarAll();

					int opecaoDis = ler.nextInt();

					if (opecaoDis == 0) {
						break;
					}

					if (opecaoDis == 2) {

					}

				}

			}
		}
		println("Voc?? fechou o File Explorer \nAt?? a pr??xima ;)");

	}

	static void menu() {
		println("");
		println("--------------------------------------------------------");
		println("Gerenciador de Arquivos File Explorer                  -");
		println("                                                       -");
		println("(0) para sair                                          -");
		println("(1) para dispositivos de Armazenamento                 -");
		println("(2) para Arquivos de Audio                             -");
		println("(3) para Documentos de Texto                           -");
		println("(4) para Arquivos de Imagem Livre                      -");
		println("(41) para Arquivos de Imagem Privado                   -");
		println("(5) para Arquivos de Video Livre                       -");
		println("(51) para Arquivos de Video Privado                    -");
		println("(99) mostrar todos os Arquivos                         -");
		println("Digite sua op????o:                                      -");
		println("--------------------------------------------------------");

	}

	static void menuDispositivo() {
		println("");
		println("---------------------");
		println("(0) para Voltar ao Menu Principal");
		println("(1) para inserir um dispositivo de armazenamento");
		println("(2) para listar os dispositivos atualmente no sistema");
		println("(3) para editar nome de disposito");
		println("(4) para excluir dispositivos atualmente no sistema");
		println("Digite sua op????o:");
	}

	static void menuAudio() {
		println("");
		println("---------------------");
		println("(0) para Voltar ao Menu Principal");
		println("(1) para inserir um aquivo de audio");
		println("(2) para listar os arquivos de audio atualmente no sistema");
		println("(3) para editar nome de audio");
		println("(4) para excluir audio atualmente no sistema");
		println("Digite sua op????o:");
	}

	static void menuDocumentoDeTexto() {
		println("");
		println("---------------------");
		println("(0) para Voltar ao Menu Principal");
		println("(1) para inserir um documento");
		println("(2) para listar os documentos atualmente no sistema");
		println("(3) para editar nome de arquivo .txt");
		println("(4) para excluir arquivo .txt atualmente no sistema");
		println("Digite sua op????o:");
	}

	static void menuImagem() {
		println("");
		println("---------------------");
		println("(0) para Voltar ao Menu Principal");
		println("(1) para inserir uma imagem");
		println("(2) para listar as imagens atualmente no sistema");
		println("(3) para editar nome da imagem");
		println("(4) para excluir imagem atualmente no sistema");
		println("Digite sua op????o:");
	}

	static void menuVideo() {
		println("");
		println("---------------------");
		println("(0) para Voltar ao Menu Principal");
		println("(1) para inserir um novo video");
		println("(2) para listar os videos atualmente no sistema");
		println("(3) para editar nome do video");
		println("(4) para excluir video atualmente no sistema");
		println("Digite sua op????o:");
	}

	static void menuMostrarAll() {
		println("");
		println("---------------------");
		println("(0) para Voltar ao Menu Principal");
		println("(2) para listar todos os arquivos atualmente no sistema");
		println("Digite sua op????o:");
	}

	static void println(String conteudo) {
		if (imprime)
			System.out.println(conteudo);

	}

}
