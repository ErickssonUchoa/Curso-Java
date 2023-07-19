import java.util.Locale;
import java.util.Scanner;

public class exc18 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Escolha seu combustivel: %n" +
                "1: Alcool%n" +
                "2: Gasolina%n" +
                "3: Diesel%n" +
                "4: Fim%n");

        int combustivel = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (combustivel != 4) {
            if (combustivel == 1) {
                alcool +=1;
            }
            else if (combustivel == 2) {
                gasolina += 1;
            }
            else if (combustivel == 3) {
                diesel += 1;
            }
            else {
                System.out.println("codigo invalido digite novamente");
            }
            System.out.printf("Escolha seu combustivel: %n" +
                    "1: Alcool%n" +
                    "2: Gasolina%n" +
                    "3: Diesel%n" +
                    "4: Fim%n");
            combustivel = sc.nextInt();
        }

        System.out.printf("Muito Obrigado!%n Alcool: %d%n Gasolina: %d%n Diesel: %d%n", alcool, gasolina, diesel);
        sc.close();
    }
}
