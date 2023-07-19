package exercises;

import java.util.Locale;
import java.util.Scanner;

public class ExVector5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valores vai ter cada vetor: ");
        int n = sc.nextInt();
        int[] vectorOne = new int[n];
        int[] vectorTwo = new int[n];
        int[] vectorThree = new int[n];

        for (int i=0; i<vectorOne.length; i++){
            System.out.print("Digite os valores do vetor A: ");
            vectorOne[i] = sc.nextInt();
        }

        for (int i=0; i<vectorTwo.length; i++) {
            System.out.print("Digite os valores do vetor B: ");
            vectorTwo[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i=0; i<vectorThree.length; i++) {
            vectorThree[i] = vectorOne[i] + vectorTwo[i];
            System.out.println(vectorThree[i]);
        }
    }
}
