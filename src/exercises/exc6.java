/* Fazer um Produto para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça
 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre
 o valor a ser pago. */
import java.util.Scanner;
import java.util.Locale;

public class exc6 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, quantidadePeca1, quantidadePeca2;
        double valorPeca1, valorPeca2, valorPagar;
        System.out.println("Peça 1: Codigo -> quantidade -> valor: ");
        cod1 = sc.nextInt();
        quantidadePeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();
        System.out.println("Peça 2: Codigo -> quantidade -> valor: ");
        cod2 = sc.nextInt();
        quantidadePeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        valorPagar = quantidadePeca1 * valorPeca1 + quantidadePeca2 * valorPeca2;
        System.out.printf("Valor a pagar = R$ %.2f%n", valorPagar);

        sc.close();
    }
}
