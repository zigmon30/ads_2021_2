package br.com.douglaskelczeski.file_explorer.composite;

import java.util.ArrayList;

public class Pasta {
	
	private String nomePasta;                                                               //atributos da classe pasta
	private ArrayList<Audio> listaMusicas;                                                  //atributo lista de musicas para compor a pasta
	
	public Pasta(String nome) {
		this.nomePasta = nome;
		listaMusicas = new ArrayList<Audio>();                                               //construtor com uma array vazio
	}
	//metodos da classe
	public void adicionaMusica(Audio musicaNova) {                                          
		listaMusicas.add(musicaNova);
		
	}
	
	public void removeMusica(Audio musicaRemovida) {
		listaMusicas.remove(musicaRemovida);
		
	}
	
	public ArrayList<Audio> getLAudios(){
		return listaMusicas;                                                                  //retorna lista de audios atualizados                                                      
	}

	public String getNomePasta() {
		return nomePasta;
	}
}
