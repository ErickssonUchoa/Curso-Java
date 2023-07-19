package exercises;

import java.util.Locale;
import java.util.Scanner;

public class ExVector1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai digitar: ");
        int n = sc.nextInt();
        int[] vector = new int[n];

        for (int i=0; i<vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextInt();
        }
        System.out.println("NEGATIVOS");
        
        for (int i=0; i<vector.length; i++) {
            if (vector[i] < 0) {
                System.out.println(vector[i]);
            }
        }

        sc.close();
    }
}
