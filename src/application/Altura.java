package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Height;

public class Altura {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int smallerNumber = 0;

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();
        Height[] vector = new Height[n];

        for (int i=0; i<vector.length; i++) {
            System.out.printf("Dados da %da pessoa: %n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            vector[i] = new Height(name, age, height);
        }

        for (int i=0; i<vector.length; i++) {
            sum += vector[i].getHeight();
        }
        double average = sum / vector.length;

        for (int i=0; i<vector.length; i++) {
            if (vector[i].getAge() < 16) {
                smallerNumber++;
            }
        }
        double percentage = ((double)smallerNumber / vector.length) * 100.0;

        System.out.printf("%nAltura media = %.2f%n", average);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%n", percentage);
        for (int i=0; i< vector.length; i++) {
            if (vector[i].getAge() < 16) {
                System.out.printf("%s%n", vector[i].getName());
            }
        }

        sc.close();
    }

}
