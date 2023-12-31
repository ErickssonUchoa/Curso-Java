package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Funcionario {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("Dados do funcionário");
        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        System.out.print("salário bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        employee.tax = sc.nextDouble();
        System.out.println("Employee: " + employee);

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Update data: " + employee);

        sc.close();
    }

}
