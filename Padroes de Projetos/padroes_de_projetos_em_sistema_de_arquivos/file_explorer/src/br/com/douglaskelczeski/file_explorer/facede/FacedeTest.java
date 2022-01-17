package br.com.douglaskelczeski.file_explorer.facede;

public class FacedeTest {

	public static void main(String[] args) {
		Documento arquivoDeTexto = new Documento("deseign_patter_Facede");
		Documento arquivoDeTexto1 = new Documento("Programa_Ola_mundo");

		
		
		System.out.print(arquivoDeTexto.getNome());
		arquivoDeTexto.formataExtencaoTxt();
		System.out.print(arquivoDeTexto.getNome());		
		arquivoDeTexto.formataExtencaoHtml();
		System.out.print(arquivoDeTexto.getNome());		
		arquivoDeTexto.formataExtencaoC();
		
		System.out.print("\n\n" + arquivoDeTexto1.getNome());		
		arquivoDeTexto1.formataExtencaoC();
		
			
	

	}

}
