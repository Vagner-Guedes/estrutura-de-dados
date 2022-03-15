package br.ucsal;

// Listar 10 números inteiros com arrays

public class AtividadeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10; 
		int vetor[]  = new int[n];
		int i;
		
		for(i=0; i<n; i++) {
	    vetor[i] = i+1;
	    System.out.println(vetor[i]);
	    System.out.println("10 números inteiros com arrays listados");
			     
		}

	}

}
