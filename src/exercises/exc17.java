import java.util.Locale;
import java.util.Scanner;

public class exc17 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as coordenadas: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        while (x != 0.0 && y != 0.0) {
            if (x > 0.0 && y > 0.0) {
                System.out.println("Q1");
            }
            else if (x < 0.0 && y > 0.0) {
                System.out.println("Q2");
            }
            else if (x < 0.0 && y < 0.0) {
                System.out.println("Q3");
            }
            else {
                System.out.println("Q4");
            }

            System.out.println("Digite novamente: ");
            x = sc.nextDouble();
            y = sc.nextDouble();
        }
        sc.close();
    }
}
