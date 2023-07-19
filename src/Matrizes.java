import java.util.Locale;
import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n =sc.nextInt();
        int count = 0;

        int[][] matriz = new int[n][n];

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) { //mesma coisa de quantidade de colunas
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("DIAGONAL PRINCIPAL");
        for (int i=0; i<matriz.length; i++) {
            System.out.println(matriz[i][i] + " ");
        }

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("NÚMEROS NEGATIVOS: " + count);

        sc.close();
    }
}
