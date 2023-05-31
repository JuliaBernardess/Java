package EstruturaDados;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();

		String nomes;
		Integer numero;

		System.out.println(
				"\t###############Menu###############\n\n \t1 - Adicionar cliente na fila.\n\t2 - Listar todos os clientes na fila.\n\t3 - Chamar (retirar) uma pessoa da fila \n\t0 - O programa deve ser finalizado.. ");

		numero = ler.nextInt();

		while (numero != 0) {
			if (numero == 1) {
				System.out.println("\nDigite o nome do cliente: "); 
				nomes = ler.next();
				fila.add(nomes);
				System.out.println("\nCliente adicionado.");
			} else if (numero == 2) {
				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia.");
				} else {
					System.out.println("\nLista de clientes na fila: " + fila);
				}
			} else if (numero == 3) {
				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia.");
				} else {
					String clienteChamado = fila.poll();
					System.out.println("\nCliente chamado: " + clienteChamado);
				}
			} else {
				System.out.println("\nOpção inválida. Tente novamente.");
			}

			System.out.println(
					"\t###############Menu###############\n\n \t1 - Adicionar cliente na fila.\n\t2 - Listar todos os clientes na fila.\n\t3 - Chamar (retirar) uma pessoa da fila \n\t0 - O programa deve ser finalizado.. ");
			numero = ler.nextInt();
		}

		System.out.println("\nPrograma finalizado.");
	}
}
