#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(){
/*
	int i=0;

	printf("end i = %p\tvalor i = %d\n",&i, i);

	int *p=NULL;

	printf("end p = %p\tvalor p = %p\n",&p, p);

	p = &i;

	printf("end p = %p\tvalor p = %p\tvalor apontado = %d\n"
		,&p, p, *p);

	i = 50;

	printf("end p = %p\tvalor p = %p\tvalor apontado = %d\n"
		,&p, p, *p);

	*p = 25;

	printf("end p = %p\tvalor p = %p\tvalor apontado = %d\n"
		,&p, p, *p);
	printf("end i = %p\tvalor i = %d\n",&i, i);


	*/

	int *p; 

	p = (int*) malloc(sizeof(int));
	*p = 20;

	printf("end p = %p\tvalor p = %p\tvalor apontado = %d\n",
		&p, p, *p);

	*p = 500;       

	printf("end p = %p\tvalor p = %p\tvalor apontado = %d\n",
		&p, p, *p);


	return 0;
}