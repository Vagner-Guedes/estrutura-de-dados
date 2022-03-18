package br.ucsal.ListaRecursividade;

import java.util.Scanner;

public class somaDeTodos_Questao4 {
	
	/*Faça um programa em java fazendo uso da recursividade que solicite para o
usuário digitar um número, em seguida, faça a soma de todos os algarismos do
número. Exemplos:
1981=1+9+8+1
2020=2+0+2+0 */

	public static void main(String[] args) {
		
		int i = 0;
		int soma = 0;
		
		System.out.println("Escreva um número inteiro:");
        Scanner sv = new Scanner (System.in);
        String x = sv.nextLine();
        
        System.out.println( retornaSoma(x, i, soma));
	}

	private static int retornaSoma(String x, int i, int soma) {
		
		if(i < x.length()) {
			
			int aux;
			aux = Integer.parseInt(x.substring(i, i+1));
		    soma = soma + aux;
		    i++;
		    return retornaSoma(x, i, soma);
		}
	    else {
		    return soma;
	    }
	}
	

}
