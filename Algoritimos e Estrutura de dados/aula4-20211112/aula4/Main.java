class Main{

	public static void main(String args[]){
		
		Produto p1 = new Produto();
		Produto p = p1;

		System.out.println(p1);
		
		p1.nome = "mouse";
		p1.id = 3;
		p1.valor = 150;
		System.out.println("id = "+p1.id+
			" nome = "+p1.nome+
			" valor = "+p1.valor);



	}

}
