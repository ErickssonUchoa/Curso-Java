package exercises;/* Faça um Produto para ler dois valores inteiros, e depois mostrar na tela a soma desses números
com uma mensagem explicativa, conforme exemplos. */

import java.util.Scanner;

public class exc2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite dois valores para somar: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = x + y;
        System.out.printf("Soma = %d%n", soma);

        sc.close();
    }
}
