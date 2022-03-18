package br.ucsal.ListaRecursividade;

public class fatorialQuestao2 {
	
	//Desenvolva um programa em java que calcule o fatorial de um número x.

	public static void main(String[] args) {
		System.out.println(fatorial(5));

	}

	private static int fatorial(int i) {
		
		if(i == 0) {
		    return 1;
		} else {
			return i *fatorial(i -1);
		}
		
	}

}
