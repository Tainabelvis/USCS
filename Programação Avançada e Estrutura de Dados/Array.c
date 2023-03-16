#include <stdio.h>
#include<locale.h>

int main(){

	setlocale(LC_ALL, "Portuguese");
	
	printf("\n********************");
	printf("\nInicio do Programa 04");
	
	int  vetor[5], i, trab;
	
	for(i=0; i <5; i++){
		printf("\nEntre com um valor numerico inteiro:");
		scanf("%d", &trab);
		vetor[i]= trab;
	}
	for (i=4; i>=0; i--)
	printf("\n%d", vetor [i]);
	
	printf("\nFim do Programa 04");
	printf("\n**********");
		}
