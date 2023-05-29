package vetoresMatrizes;

import java.util.Scanner;

public class vetores1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println(" Digite o número que você deseja encontrar: ");
		int numeroEscolhido = ler.nextInt();

		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			if (numeroEscolhido == vetorInteiros[indice]) {
				System.out.println("O número " + numeroEscolhido + " está localizado na posição: " + indice);
				vetorInteiros[indice] = ler.nextInt();
				return;

			}

		}
		System.out.println(" O número " + numeroEscolhido + "não foi encontrado ");
	}
}
