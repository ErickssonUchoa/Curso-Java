package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Gender;

public class Genero {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();
        Gender[] vectorHeight = new Gender[n];
        Gender[] vectorGender = new Gender[n];
        int amountWomen = 0, quantityMen = 0;
        double smaller, bigger, averageWomen, sum = 0;

        for (int i=0; i<n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double height = sc.nextDouble();
            vectorHeight[i] = new Gender(height);
            System.out.printf("Gênero da %da pessoa: ", i + 1);
            char gender = sc.next().charAt(0);
            vectorGender[i] = new Gender(gender);
        }

        smaller = vectorHeight[0].getHeight();
        bigger = vectorHeight[0].getHeight();

        for (int i=0; i<n; i++) {
            if (smaller > vectorHeight[i].getHeight()) {
                smaller = vectorHeight[i].getHeight();
            }
            if (bigger < vectorHeight[i].getHeight()) {
                bigger = vectorHeight[i].getHeight();
            }
        }

        for (int i=0; i<n; i++) {
            if (vectorGender[i].getGender() == 'f') {
                sum += vectorHeight[i].getHeight();
                amountWomen++;
            }

            else {
                quantityMen++;
            }
        }

        averageWomen = sum / (double)amountWomen;

        System.out.printf("MENOR ALTURA: %.2f%n", smaller);
        System.out.printf("MAIOR ALTURA: %.2f%n", bigger);
        System.out.printf("MÉDIA DAS ALTURAS DAS MULHERES: %.2f%n", averageWomen);
        System.out.printf("QUANTIDADE DE HOMENS: %d%n", quantityMen);


    }
}
