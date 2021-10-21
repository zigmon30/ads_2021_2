package br.com.douglaskelczeski.file_explorer.entidades;

import java.util.ArrayList;

public class TodosOsArquivos {
	private ArrayList<ImagemLivre> imagens;
	private ArrayList<ImagemPrivada> imagensp;
	private ArrayList<VideoLivre> videos;
	private ArrayList<VideoPrivado> videosp;

	public TodosOsArquivos(ArrayList<ImagemLivre> imagens, ArrayList<ImagemPrivada> imagensp,
			ArrayList<VideoLivre> videos, ArrayList<VideoPrivado> videosp) {
		super();
		this.imagens = new ArrayList<ImagemLivre>();
		this.imagensp = new ArrayList<ImagemPrivada>();
		this.videos = new ArrayList<VideoLivre>();
		this.videosp = new ArrayList<VideoPrivado>();
	}
	
	public TodosOsArquivos(ArrayList<ImagemLivre> imagens,
			ArrayList<VideoLivre> videos) {
		super();
		this.imagens = imagens;		
		this.videos = videos;
		
	}

	public ArrayList<ImagemLivre> getImagens() {
		return imagens;
	}

	public void setImagens(ArrayList<ImagemLivre> imagens) {
		this.imagens = imagens;
	}

	public ArrayList<ImagemPrivada> getImagensp() {
		return imagensp;
	}

	public void setImagensp(ArrayList<ImagemPrivada> imagensp) {
		this.imagensp = imagensp;
	}

	public ArrayList<VideoLivre> getVideos() {
		return videos;
	}

	public void setVideos(ArrayList<VideoLivre> videos) {
		this.videos = videos;
	}

	public ArrayList<VideoPrivado> getVideosp() {
		return videosp;
	}

	public void setVideosp(ArrayList<VideoPrivado> videosp) {
		this.videosp = videosp;
	}
	
	

}
