package exercises;

import java.util.Locale;
import java.util.Scanner;

public class ExMatriz {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int m = sc.nextInt();
        System.out.print("Digite o número de colunas: ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite um valor da matriz: ");
        int x = sc.nextInt();

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (matriz[i][j] == x) {
                    System.out.printf("Position: %d,%d%n", i, j);
                    if (j > 0) {
                        System.out.printf("Left: %d%n", matriz[i][j-1]);
                    }
                    else if (i > 0) {
                        System.out.printf("Up: %d%n ", matriz[i-1][j]);
                    }
                    else if (j < matriz[i].length - 1) {
                        System.out.printf("Right: %d%n", matriz[i][j+1]);
                    }
                    else if (i < matriz.length - 1) {
                        System.out.printf("Down: %d%n", matriz[i+1][j]);
                    }
                }
            }
        }
    }
}
