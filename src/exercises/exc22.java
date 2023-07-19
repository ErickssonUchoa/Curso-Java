import java.util.Scanner;
import java.util.Locale;

public class exc22 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos números vão ser lidos pelo Programa: ");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i=1; i<=n; i++) {
            System.out.print("Digite os números a ser lidos: ");
            double x = sc.nextDouble();

            if (x >=10 && x <= 20) {
                in += 1;
            }
            else {
                out += 1;
            }
        }

        System.out.printf("%d in%n out %d%n", in, out);
        sc.close();

    }
}
