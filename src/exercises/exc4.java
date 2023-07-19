/* Fazer um Produto para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */

import java.util.Scanner;

public class exc4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com quatro números inteiros para tirar a diferença: ");
        int a, b, c, d, dif;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        dif = a * b - c * d;

        System.out.printf("Diferença = %d%n", dif);

        sc.close();
    }
}
