package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Older;

public class Velho {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar: ");
        int n = sc.nextInt();
        Older[] vectorName = new Older[n];
        Older[] vectorAge = new Older[n];
        int olderAge = 0;
        String nameOlder = "";

        for (int i=0; i<n; i++) {
            sc.nextLine();
            System.out.printf("dados da %da pessoa:%n", i + 1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            vectorName[i] = new Older(name);
            System.out.print("Idade: ");
            int age = sc.nextInt();
            vectorAge[i] = new Older(age);
        }

        for (int i=0; i<n; i++) {
            if (vectorAge[i].getAge() > olderAge) {
                olderAge = vectorAge[i].getAge();
                nameOlder = vectorName[i].getName();
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", nameOlder);

        sc.close();
    }

}
