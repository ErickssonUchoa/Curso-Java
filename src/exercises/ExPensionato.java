package exercises;

import java.util.Locale;
import java.util.Scanner;
import entities.Bedrooms;

public class ExPensionato {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numberBedroom;
        Bedrooms[] bedrooms = new Bedrooms[9];
        System.out.print("Quantos Estudantes serão cadastrados: ");
        int quantityStudents = sc.nextInt();

        for (int i=0; i<quantityStudents; i++) {
            System.out.print("Qual quarto deseja ficar: ");
            numberBedroom = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite seu nome: ");
            String name = sc.nextLine();
            System.out.print("Digite seu email: ");
            String email = sc.nextLine();
            bedrooms[numberBedroom] = new Bedrooms(name, email);
        }

        System.out.println("OCUPAÇÃO DO PENSIONATO");
        for (int i=0; i<bedrooms.length; i++) {
            if (bedrooms[i] != null) {
                System.out.printf("%d: %s %s%n", i, bedrooms[i].getName(), bedrooms[i].getEmail());
            }
        }

        sc.close();
    }
}
