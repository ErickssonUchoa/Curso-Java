import java.util.Scanner;

public class exc12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o codigo do produto: ");
        int cod = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();
        double total;

        if (cod == 1) {
            total = quantidade * 4.00;
            System.out.printf("Total = R$ %.2f", total);
        }
        else if (cod ==2) {
            total = quantidade * 4.50;
            System.out.printf("Total = R$ %.2f", total);
        }
        else if (cod == 3) {
            total = quantidade * 5.00;
            System.out.printf("Total = R$ %.2f", total);
        }
        else if (cod == 4) {
            total = quantidade * 2.00;
            System.out.printf("Total = R$ %.2f", total);
        }
        else if (cod == 5) {
            total = quantidade * 1.50;
            System.out.printf("Total = R$ %.2f", total);
        }
        else {
            System.out.println("Codigo invalido");
        }

        sc.close();
    }
}
