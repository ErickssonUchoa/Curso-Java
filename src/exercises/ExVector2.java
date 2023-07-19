package exercises;

import java.util.Locale;
import java.util.Scanner;

public class ExVector2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números dejesa digitar: ");
        int n = sc.nextInt();
        double sum, average;
        double[] vector = new double[n];

        for (int i=0; i<vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextDouble();
        }

        sum = 0;
        for (int i=0; i<vector.length; i++) {
            sum += vector[i];
        }

        average = sum / vector.length;
        System.out.print("VALORES = ");
        for (int i=0; i<vector.length; i++) {
            System.out.printf("%.1f ", vector[i]);
        }
        System.out.println();
        System.out.printf("SOMA = %.1f%n", sum);
        System.out.printf("MÉDIA = %.1f%n", average);






    }
}
