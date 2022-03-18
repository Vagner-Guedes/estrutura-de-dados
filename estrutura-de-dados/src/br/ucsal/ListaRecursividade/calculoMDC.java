package br.ucsal.ListaRecursividade;

public class calculoMDC {
	
/*O método a seguir, executa o cálculo do MDC (máximo divisor comum) de
	dois inteiros positivos m e n. Escreva um método recursivo equivalente.
	public static int CalculaMDC(int m, int n){
	int r;
	do{
	r = m%n;
	m = n;
	n = r;
	} while (r !=
	0); return m;
	}*/

	public static int MDC(int m, int n) {
			
		int r;
		r = m%n;
		
		if (r != 0) {
			m=n;
			n=r;
			return MDC(m, n);
		} 
		else {
		   return n;
		}

	}
	public static void main(String[] args) {
		System.out.println(MDC (200,210));
	}

}
