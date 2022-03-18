package br.ucsal.ListaRecursividade;

public class torreDeHanoi_Questao5 {
	
	/*Torre De Hanoi.
Objetivo: consiste em deslocar todos os discos da haste onde se encontram para
uma haste diferente, respeitando as seguintes regras:
1. deslocar um disco de cada vez, o qual deverá ser o do topo de uma das
três hastes;
2. cada disco nunca poderá ser colocado sobre outro de diâmetro mais
pequeno.
Para nosso desafio, são dados um conjunto de n discos com diferentes
tamanhos e três bases A, B e C.
O problema consiste em imprimir os passos necessários para transferir os discos
da base A para a base C, usando a base B como auxiliar, nunca colocando
discos maiores sobre menores.
Segue os passos para solução
1o passo: Mover de A para C.
2o passo: Mover de A para B.
3o passo: Mover de C para B.
4o passo: Mover de A para C.
5o passo: Mover de B para A.
6o passo: Mover de B para C.
7o passo: Mover de A para C.*/

	public static void main(String[] args) {
		
		int argolas = 3;
		int a = argolas, b = 0, c = 0;
		c = movA(a, b, c, argolas);
		
		System.out.println(c);
	}

	private static int movA(int a, int b, int c, int argolas) {
		
		if (a == argolas) {
			a--;
			c++;
			a--;
			b++;
			return movC(a, b, c, argolas);
		} else {
			a--;
			c++;
			if(c < argolas) {
				return movB(a, b, c, argolas);
			} else {
		        return c;
			}
		}
		
	}

	private static int movB(int a, int b, int c, int argolas) {
		  
		b--;
		a++;
		b--;
		c++;
		
		return movA(a, b, c, argolas);
		
	}

	private static int movC(int a, int b, int c, int argolas) {
		
		c--;
		b++;
		
		return movA(a, b, c, argolas);
	}

}
