package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Approved;

public class Aprovados {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados: ");
        int n = sc.nextInt();
        Approved[] vectorName = new Approved[n];
        Approved[] vectorNoteOne = new Approved[n];
        Approved[] vectorNoteTwo = new Approved[n];
        double sum = 0, average = 0;

        for (int i=0; i<n; i++) {
            sc.nextLine();
            System.out.printf("Informações do %do aluno: %n", i + 1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            vectorName[i] = new Approved(name);
            System.out.print("Primeira nota: ");
            double noteOne = sc.nextDouble();
            vectorNoteOne[i] = new Approved(noteOne);
            System.out.print("Segunda nota: ");
            double noteTwo = sc.nextDouble();
            vectorNoteTwo[i] = new Approved(noteTwo);
        }

        System.out.println("ALUNOS APROVADOS:");
        for (int i=0; i<n; i++) {
            if ((vectorNoteOne[i].getNoteOne() + vectorNoteTwo[i].getNoteTwo() / 2) >= 6.0) {
                System.out.println(vectorName[i].getName());
            }
        }

        sc.close();
    }
}
