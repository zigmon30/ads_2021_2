class Main{

	public static void main(String args[]){
		Diretor diretor = new Diretor();
		diretor.nome = "Quentin Tarantino";
		diretor.cpf = "555.555.555-55";
		diretor.idade = 55;

		Filme f1 = new Filme();
		f1.titulo = "Kill Bill";
		f1.genero = "ação";
		f1.ano = 2005;
		f1.diretor = diretor;

		Filme f2 = new Filme();
		f2.titulo = "Pulp Fiction";
		f2.genero = "ação";
		f2.ano = 1994;
		f2.diretor = diretor;

		Filme f3 = new Filme();
		f3.titulo = "Django";
		f3.genero = "Faroeste";
		f3.ano = 2012;
		f3.diretor = diretor;

		System.out.println("Diretor\nEnd: "+diretor
			+"\tNome: "+diretor.nome+
			"\tcpf: "+diretor.cpf+"\tidade: "+diretor.idade+"\n");

		System.out.println("F1\nEnd: "+f1+
			"\tTitulo: "+f1.titulo +
			"\tGenero: "+f1.genero +
			"\tAno: "+f1.ano+
			"\tEnd Diretor: "+f1.diretor+
			"\tNome Diretor: "+f1.diretor.nome+"\n");

		System.out.println("F2\nEnd: "+f2+
			"\tTitulo: "+f2.titulo +
			"\tGenero: "+f2.genero +
			"\tAno: "+f2.ano+
			"\tEnd Diretor: "+f2.diretor+
			"\tNome Diretor: "+f2.diretor.nome+"\n");

		System.out.println("F3\nEnd: "+f3+
			"\tTitulo: "+f3.titulo +
			"\tGenero: "+f3.genero +
			"\tAno: "+f3.ano+
			"\tEnd Diretor: "+f3.diretor+
			"\tNome Diretor: "+f3.diretor.nome+"\n");



}
}
