package br.com.douglaskelczeski.file_explorer.composite;

import java.util.ArrayList;

public class Pasta {
	
	private String nomePasta;
	private ArrayList<Audio> listaMusicas;
	
	public Pasta(String nome) {
		this.nomePasta = nome;
		listaMusicas = new ArrayList<Audio>();
	}
	
	public void adicionaMusica(Audio musicaNova) {
		listaMusicas.add(musicaNova);
		
	}
	
	public void removeMusica(Audio musicaRemovida) {
		listaMusicas.remove(musicaRemovida);
		
	}
	
	public ArrayList<Audio> getLAudios(){
		return listaMusicas;
	}

	public String getNomePasta() {
		return nomePasta;
	}
}
