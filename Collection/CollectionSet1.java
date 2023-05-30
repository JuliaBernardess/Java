package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();

		Iterator<Integer> numero1 = numeros.iterator();

		Integer numero = Integer.valueOf(10);

		for (int y = 0; y <= 9; y++) {
			System.out.println(" Digite um número: ");
			numero = ler.nextInt();
			numeros.add(numero);
		}

		System.out.println("\n Listar dados  Set: " + numeros + "\n");

	}
}
