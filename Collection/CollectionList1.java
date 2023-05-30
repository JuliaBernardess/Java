package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionList1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		String core;

		for (int y = 0; y <= 4; y++) {
			System.out.println(" Digite as cores ");
			core = ler.next();
			cores.add(core);
		}
		

		System.out.println("\n Mostrar cores " + cores + "\n");

		Collections.sort(cores);

		System.out.println(" Cores em ordem: " + "\n" + cores);
		
	}
}
