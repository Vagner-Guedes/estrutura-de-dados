package br.ucsal.ListaRecursividade;


public class baseBinaria_Questao3 {
	
	/* Escreva em java um método recursivo que receba um número inteiro na base
decimal e realize a conversão deste número para base binária.*/

	public static void main(String[] args) {
		
		String binario = "";
		System.out.println(conversorBinario(100, binario));

	}

	private static int conversorBinario(int i, String binario) {
		
		if(i > 0) {
			
			int div = i/2;
			int resto = i%2;
			i =div;
			binario = Integer.toString(resto)+ binario;
			return conversorBinario(i, binario);
			
			
		}else {
			i = Integer.parseInt(binario); 
		    return i;
		}
	}

}
