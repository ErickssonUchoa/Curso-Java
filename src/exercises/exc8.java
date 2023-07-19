// Fazer um Produto para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;
public class exc8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positivo");
        }
        else {
            System.out.println("Negativo");
        }


    }

}

