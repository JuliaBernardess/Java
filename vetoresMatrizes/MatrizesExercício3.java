package vetoresMatrizes;

import java.util.Scanner;

public class MatrizesExercício3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int matrizInteiro[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = 3,somaP = 0,somaS = 0;
       

        System.out.println("Diagonal Principal");
        for (int indice = 0; indice < n; indice++) {
            System.out.print(matrizInteiro[indice][indice] + " ");
            
            somaP += matrizInteiro[indice][indice];
        }

        System.out.println("\nDiagonal Secundária");
        for (int indice = 0; indice < n; indice++) {
            System.out.print(matrizInteiro[indice][n - 1 - indice] + " ");
            
            somaS += matrizInteiro[indice][n - 1 - indice];
        }

        System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaP);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaS);

        
    }
}
