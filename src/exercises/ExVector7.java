package exercises;

import java.util.Locale;
import java.util.Scanner;

public class ExVector7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        int sumPairs = 0, quantityPairs = 0;
        double averagePairs;

        for (int i=0; i<vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextInt();
        }

        for (int i=0; i<vector.length; i++) {
            if (vector[i] % 2 == 0) {
                sumPairs += vector[i];
                quantityPairs++;
            }
        }

        if (quantityPairs == 0) {
            System.out.println("NENHUM NÚMERO PAR");
        }
        else {
            averagePairs = (double)sumPairs / quantityPairs;
            System.out.printf("MÉDIA DOS PARES: %.1f%n", averagePairs);
        }

        sc.close();

    }
}
