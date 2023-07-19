// Fazer um Produto para ler um número inteiro e dizer se este número é par ou ímpar.
import java.util.Scanner;
public class exc9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("DIGITE UM VALOR: ");
        int n = sc.nextInt();

        if(n % 2 == 0) {
            System.out.println("Este número é par");
        }
        else {
            System.out.println("Este número é impar");
        }

        sc.close();
    }
}
