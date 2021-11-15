#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct _produto{
	int id;
	char nome[10];
	float valor;
}Produto;

int main(){

	Produto p;
	p.id=1;
	strcpy(p.nome, "mouse");
	p.valor = 150;

	printf("%p - %d - %s - %f\n",&p, p.id, p.nome, p.valor);

	Produto *p2 = (Produto*) malloc(sizeof(Produto));
	p2->id = 2;
	strcpy(p2->nome, "teclado");
	p2->valor = 200;

	printf("%p - %p - %d - %s - %f\n"
		,&p2, p2, p2->id, p2->nome, p2->valor);


	return 0;
}






