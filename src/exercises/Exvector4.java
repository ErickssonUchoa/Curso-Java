package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exvector4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int n = sc.nextInt();
        double[] vector = new double[n];

        for (int i=0; i<vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextDouble();
        }

        int higherPosition = 0;
        double bigger = 0;

        for (int i=0; i<vector.length; i++) {
            if(vector[i] > bigger) {
                bigger = vector[i];
                higherPosition = i;
            }
        }

        System.out.printf("MAIOR VALOR: %.1f%n", bigger);
        System.out.printf("POSIÇÃO DO MAIOR VALOR: %d%n", higherPosition);
    }

}
