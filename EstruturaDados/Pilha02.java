package EstruturaDados;
import java.util.Stack;
import java.util.Scanner;

public class Pilha02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Stack<String>pilha = new Stack<String>();
		
		String livros;
		Integer numero;
		
		System.out.println("\t###############Menu###############\n");
		System.out.println("\t1 - Adicionar livro na pilha.\n");
		System.out.println("\t2 - Listar todos os livros.\n");
		System.out.println("\t3 - Retirar um livro.\n ");
		System.out.println("\t0 - Sair.\n");
		
		numero = ler.nextInt();
		
		while (numero != 0) {
			if (numero == 1) {
				System.out.println("\nDigite o nome do Livro: ");
				ler.nextLine();
				
				livros = ler.nextLine();
				pilha.add(livros);
				System.out.println("\nLivro adicionado.");
			} else if (numero == 2) {
				if (pilha.isEmpty()) {
					System.out.println("\nA pilha está vazia.");
				} else {
					System.out.println("\nLista de livros: " + pilha);
				}
			} else if (numero == 3) {
				if (pilha.isEmpty()) {
					System.out.println("\nA pilha está vazia.");
				} else {
					String livroEscolhido = pilha.pop();
					System.out.println("\nLivro: " + livroEscolhido);
				}
			} else {
				System.out.println("\nOpção inválida.Escolha outra opção.");
			}

			System.out.println("\t###############Menu###############\n");
			System.out.println("\t1 - Adicionar livro na pilha.\n");
			System.out.println("\t2 - Listar todos os livros.\n");
			System.out.println("\t3 - Retirar um livro.\n ");
			System.out.println("\t0 - Sair.\n");
			numero = ler.nextInt();
		}

		System.out.println("\nPrograma finalizado.");
	


		
		
		
	}
}
