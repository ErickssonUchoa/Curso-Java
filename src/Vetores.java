import java.util.Locale;
import java.util.Scanner;
import entities.Vectors;

public class Vetores {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//
//       --> VETOR DE TIPO VALOR <--

//        System.out.print("Digite o tamanho do vetor: ");
//        int n = sc.nextInt();
//        double[] vect = new double[n];
//
//        for (int i=0; i<n; i++) {
//            System.out.print("Digite os valores do vetor: ");
//            vect[i] = sc.nextDouble();
//        }
//
//        double sum = 0;
//        for (int i=0; i<n; i++) {
//            sum += vect[i];
//        }
//        double avg = sum / n;
//        System.out.printf("Média dos valores: %.2f%n", avg);

        System.out.print("Digite o tamanho do vetor de produtos: ");
        int n = sc.nextInt();
        Vectors[] vector = new Vectors[n];

        for (int i=0; i<vector.length; i++) {
            sc.nextLine();
            System.out.print("Digite o nome do produto: ");
            String name = sc.nextLine();
            System.out.print("Digite o valor do produto: ");
            double price = sc.nextDouble();
            vector[i] = new Vectors(name, price);
        }

        double sum = 0;
        for (int i=0; i<vector.length; i++) {
            sum += vector[i].getPrice();
        }

        double avg = sum / vector.length;
        System.out.printf("Média dos valores: %.2f%n", avg);
    }
}
