// Leia 2 valores inteiros (A e B). Após, o Produto deve mostrar uma mensagem "Sao Multiplos" ou
// "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números
// devem poder ser digitados em ordem crescente ou decrescente.

import java.util.Scanner;

public class exc10 {

    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite dois valores: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a % b == 0 || b % a == 0) {
            System.out.println("São multiplos");
        }
        else {
            System.out.println("Não são multiplos");
        }

        sc.close();
    }

}
