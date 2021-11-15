#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct _diretor{
	char nome[20];
	char cpf[12];
	int idade;
}Diretor;

typedef struct _filme{
	char titulo[20];
	char genero[10];
	int ano;
	Diretor *diretor;
}Filme;

int main(){
	Diretor *diretor = (Diretor*) malloc(sizeof(Diretor));
	strcpy(diretor->nome,"Quentin Tarantino");
	strcpy(diretor->cpf,"55555555555");
	diretor->idade = 55;

	Filme *f1 = (Filme*) malloc(sizeof(Filme));
	strcpy(f1->titulo,"kill bill");
	strcpy(f1->genero,"ação");
	f1->ano = 2005;
	f1->diretor = diretor;


	Filme *f2 = (Filme*) malloc(sizeof(Filme));
	strcpy(f2->titulo,"Pulp Fiction");
	strcpy(f2->genero,"ação");
	f2->ano = 1994;
	f2->diretor = diretor;

	Filme *f3 = (Filme*) malloc(sizeof(Filme));
	strcpy(f3->titulo,"Django");
	strcpy(f3->genero,"Faroeste");
	f1->ano = 2012;
	f3->diretor = diretor;


	printf("Diretor\nEnd: %p\tnome: %s\tcpf:%s\tidade:%d\n\n",
		diretor, diretor->nome, diretor->cpf, diretor->idade);


	printf("F1\nEnd: %p\ttitulo: %s\tgenero:%s\tend_diretor:%p\n",
		f1, f1->titulo, f1->genero, f1->diretor);
	printf("Diretor f1: nome: %s\n\n",f1->diretor->nome);

	printf("F2\nEnd: %p\ttitulo: %s\tgenero:%s\tend_diretor:%p\n",
		f2, f2->titulo, f2->genero, f2->diretor);
	printf("Diretor f2: nome: %s\n\n",f2->diretor->nome);

	printf("F3\nEnd: %p\ttitulo: %s\tgenero:%s\tend_diretor:%p\n",
		f3, f3->titulo, f3->genero, f3->diretor);
	printf("Diretor f3: nome: %s\n\n",f3->diretor->nome);

	strcpy(diretor->nome, "Mauricio");

	printf("Diretor\nEnd: %p\tnome: %s\tcpf:%s\tidade:%d\n\n",
		diretor, diretor->nome, diretor->cpf, diretor->idade);


	printf("F1\nEnd: %p\ttitulo: %s\tgenero:%s\tend_diretor:%p\n",
		f1, f1->titulo, f1->genero, f1->diretor);
	printf("Diretor f1: nome: %s\n\n",f1->diretor->nome);

	printf("F2\nEnd: %p\ttitulo: %s\tgenero:%s\tend_diretor:%p\n",
		f2, f2->titulo, f2->genero, f2->diretor);
	printf("Diretor f2: nome: %s\n\n",f2->diretor->nome);

	printf("F3\nEnd: %p\ttitulo: %s\tgenero:%s\tend_diretor:%p\n",
		f3, f3->titulo, f3->genero, f3->diretor);
	printf("Diretor f3: nome: %s\n\n",f3->diretor->nome);




	return 0;
}














