package projeto2_douglas_lista_encadeada;



public class PrincipalMain {

	public static void main(String[] args) {
		ListaEncadeadaConstrutores listaCosntrutores = new ListaEncadeadaConstrutores();
		System.out.println("Num Elementos " + listaCosntrutores.numElementos
							+"\nPrimeiro = " + listaCosntrutores.primeiro
							+"\nUltimo = " + listaCosntrutores.ultimo);
		
		Construtor cons = new Construtor();
		cons.nome = "Não especificado";
		cons.cpf = 11111111111L;
		cons.idade = 0;
		cons.naturalidade = " ";

		listaCosntrutores.inserir(cons);
		
		System.out.println("Num Elementos " + listaCosntrutores.numElementos
				+"\nPrimeiro = " + listaCosntrutores.primeiro
				+"\nUltimo = " + listaCosntrutores.ultimo);
		
		cons = new Construtor();
		cons.nome = "Douglas de Lara";
		cons.cpf = Long.parseLong("33333333333");
		cons.idade = 55;
		cons.naturalidade = "Canoinhence";

		listaCosntrutores.inserir(cons);
		
		System.out.println("Num Elementos " + listaCosntrutores.numElementos
				+"\nPrimeiro = " + listaCosntrutores.primeiro
				+"\nUltimo = " + listaCosntrutores.ultimo);

		cons = new Construtor();
		cons.nome = "Elenita Zaluski Kelczeski";
		cons.cpf = Long.parseLong("22222222222");
		cons.idade = 35;
		cons.naturalidade = "Mafrense";
		
		listaCosntrutores.inserir(cons);
		
		System.out.println("Num Elementos " + listaCosntrutores.numElementos
				+"\nPrimeiro = " + listaCosntrutores.primeiro
				+"\nUltimo = " + listaCosntrutores.ultimo);
		
		System.out.println();
		
		listaCosntrutores.listar();
	}

}
