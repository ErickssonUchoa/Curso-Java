import java.util.Scanner;
import java.util.Locale;

public class exc24 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas vezes será realizada a divisão: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            System.out.print("Digite o dividendo e o denominador: ");
            double dividendo = sc.nextDouble();
            double denominador = sc.nextDouble();

            if (denominador == 0) {
                System.out.println("Divisão impossível!");
            }

            else {
                double resultado = dividendo / denominador;
                System.out.printf("Resultado = %.1f%n", resultado);
            }

        }

        sc.close();
    }
}
