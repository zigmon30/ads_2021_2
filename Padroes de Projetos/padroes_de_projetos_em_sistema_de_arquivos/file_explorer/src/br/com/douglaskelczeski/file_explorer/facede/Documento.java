package br.com.douglaskelczeski.file_explorer.facede;

public class Documento {
	private FormatoTexto txt;
	private FormatoTexto c;
	private FormatoTexto html;
	private String nome;
	private String formato;
	private double tamanho;
	
	//construtor
	public Documento(String nome) {
		super();
		this.nome = nome;
		txt = new Txt();
		c = new C();
		html = new Html();
		
	}
	//metodos para cada tipo de formato
	public void formataExtencaoTxt() {
		txt.formatar();
	}
	public void formataExtencaoC() {
		c.formatar();
	}
	public void formataExtencaoHtml() {
		html.formatar();
	}

	public Documento(String nome, String formato, double tamanho) {
		super();
		this.nome = nome;
		this.formato = formato;
		this.tamanho = tamanho;
	}

	public Documento(String nome, double tamanho) {
		super();
		this.nome = nome;
		this.tamanho = tamanho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getFormatarDocumento() {
		return formato = ".txt";
	}
}
