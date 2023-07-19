package exercises;

import java.util.Locale;
import java.util.Scanner;

public class ExVector6 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor: ");
        int n = sc.nextInt();
        double sum = 0;
        double averageVector = 0;
        double belowAverage = 0;
        double[] vector = new double[n];

        for (int i=0; i<vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextDouble();
            sum += vector[i];
        }

        averageVector = sum / vector.length;
        System.out.printf("MÉDIA DO VETOR: %.2f%n", averageVector);

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for (int i=0; i<vector.length; i++) {
            if (vector[i] < averageVector) {
                System.out.printf("%.1f%n", vector[i]);
            }
        }

    }
}
