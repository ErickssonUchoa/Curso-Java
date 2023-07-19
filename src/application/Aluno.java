package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Aluno {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Digite o nome do Aluno: ");
        student.name = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        student.noteOne = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        student.noteTwo = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        student.noteThree = sc.nextDouble();

        if (student.finalGrade() >= 60.0) {
            System.out.println("Final grade = " + student.finalGrade());
            System.out.println("PASS");
        }
        else {
            System.out.println("Final grade = " + student.finalGrade());
            System.out.println("FAILED");
            System.out.println("MISSING " + student.missingNote() + " POINTS");
        }

        sc.close();
    }
}
