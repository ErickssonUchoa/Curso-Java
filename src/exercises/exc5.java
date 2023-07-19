/* Fazer um Produto que leia o número de um funcionário, seu número de horas trabalhadas, o
valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do
funcionário, com duas casas decimais. */

import java.util.Scanner;
import java.util.Locale;

public class exc5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do funcionário: ");
        int numeroFuncionario = sc.nextInt();
        System.out.print("Digite as horas Trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();
        System.out.print("Digite o valor por hora trabalhada: ");
        double valorPorHoraTrabalhada = sc.nextDouble();
        double salario = horasTrabalhadas * valorPorHoraTrabalhada;
        System.out.printf("Número do funcionário: %d%n Salário = U$ %.2f%n", numeroFuncionario, salario);

        sc.close();
    }
}
