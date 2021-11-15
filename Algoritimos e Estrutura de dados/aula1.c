#include <stdio.h>
#include <string.h>

typedef struct _aluno{
	char nome[20];
	int matricula;
}Aluno;


int main(){

	Aluno a1; 
	strcpy(a1.nome,"João");
	a1.matricula = 12345;

	printf("endereço de a1=%p\n",&a1);
	printf("nome de a1=%s\nendereço do nome de a1=%p\n"
		,a1.nome,&a1.nome);
	printf("matricula de a1=%d\nendereço da matricula de a1=%p\n"
		,a1.matricula, &a1.matricula);

	/*int i = 5;

	printf("valor de i=%d \nendereço de i=%p\n",i, &i);

	int v[5];
	printf("endereço de v=%p\n",&v);

	for(i=0; i<5;i++){
		v[i] = i;
		printf("valor de v[%d]=%d \nendereço de v[%d]=%p\n",i,v[i],i,&v[i]);
	}*/




	return 0;
}