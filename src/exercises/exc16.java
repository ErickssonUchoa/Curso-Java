import java.util.Locale;
import java.util.Scanner;

public class exc16 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        int senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("Senha invalida! Digite novamente: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido!");

        sc.close();

    }
}
