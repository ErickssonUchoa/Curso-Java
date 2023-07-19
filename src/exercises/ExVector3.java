package exercises;

import java.util.Locale;
import java.util.Scanner;

public class ExVector3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números dejesa digitar: ");
        int n = sc.nextInt();
        int quantityPairs = 0;
        int[] vector = new int[n];

        for (int i=0; i<vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS PARES:");
        for (int i=0; i<vector.length; i++) {
            if (vector[i] % 2 == 0) {
                System.out.printf("%d ", vector[i]);
                quantityPairs++;
            }
        }
        System.out.println();
        System.out.printf("Quantidade de pares = %d", quantityPairs);

        sc.close();
    }

}
