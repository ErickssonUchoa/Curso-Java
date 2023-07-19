/* Faça um Produto para ler o valor do raio de um círculo, e depois mostrar o valor da área deste
círculo com quatro casas decimais conforme exemplos:
Fórmula da área: area = π . raio 2
Considere o valor de π = 3.14159 */

import java.util.Scanner;
import java.util.Locale;

public class exc3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio para calcular a area: ");
        double pi = 3.14159;
        double raio = sc.nextDouble();
        double area = pi * Math.pow(raio, 2);
        System.out.printf("Area = %.4f%n", area);

        sc.close();
    }
}
