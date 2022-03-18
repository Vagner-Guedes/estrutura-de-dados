package br.ucsal.listaEncadeada;

public class TestaListaEncadeada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				TestaListaEncadeada testaListaEncadeada = new TestaListaEncadeada();
				ListaEncadeada listaEncadeada = new ListaEncadeada();
				
				testaListaEncadeada.addContato(listaEncadeada);
				System.out.println("Todos os contatos foram adicionados com sucesso!!");
				System.out.println("Você tem os seguintes contatos adicionados: ");
				while(listaEncadeada.temProximo()) {
					System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
				}
				System.out.println("Agora vamos remover!!");
				
				testaListaEncadeada.removerContato(listaEncadeada);
				System.out.println("Contatos removidos");
				System.out.println("A lista ficou assim: ");
				while(listaEncadeada.temProximo()) {
					System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
				}
				
			}
			
			public void addContato(ListaEncadeada listaEncadeada) {
			    Contato contato1 = new Contato(1, "Mario", "mario@email.com.br"); //valor1
			    Contato contato2 = new Contato(2, "Angela", "angela@email.com.br"); //valor 2
			    Contato contato3 = new Contato(3, "Osvaldo", "osvaldo@email.com.br"); //valor3
			    Contato contato4 = new Contato(4, "Marcos", "marcos@email.com.br"); //valor 4
			    Contato contato5 = new Contato(5, "Fernando", "fernando@email.com.br"); //valor 5
			    Contato contato6 = new Contato(6, "Semiramis", "semiramis@email.com.br"); //valor 6
			    Contato contato7 = new Contato(7, "João", "joao@email.com.br"); //valor 7
			    Contato contato8 = new Contato(8, "Lucia", "lucia@email.com.br"); //valor 8
			    Contato contato9 = new Contato(9, "Carlos", "carlos@email.com.br"); //valor 9
			    Contato contato10 = new Contato(10, "Beatriz", "beatriz@email.com.br"); //valor 10
				
				listaEncadeada.adicionar(contato1); 
				listaEncadeada.adicionar(contato2); 
				listaEncadeada.adicionar(contato3); 
				listaEncadeada.adicionar(contato4);
				listaEncadeada.adicionar(contato5);
				listaEncadeada.adicionar(contato6); 
				listaEncadeada.adicionar(contato7); 
				listaEncadeada.adicionar(contato8); 
				listaEncadeada.adicionar(contato9); 
				listaEncadeada.adicionar(contato10); 
			}
			
			public void removerContato(ListaEncadeada listaEncadeada) {
				listaEncadeada.remover();
				listaEncadeada.remover();
				listaEncadeada.remover();
				listaEncadeada.remover();
				listaEncadeada.remover();
				
			}

}
