package application;

import entities.AbstrataCircle;
import entities.AbstrataRectangle;
import entities.AbstrataShape;
import entities.enums.AbstrataColor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Abstratas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<AbstrataShape> shape = new ArrayList<>();

        System.out.print("Enter the numbers of shapes: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            sc.nextLine();
            System.out.println("Shape #" + i + "data:");
            System.out.print("Rectangle or Circle (r/c): ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            AbstrataColor color = AbstrataColor.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shape.add(new AbstrataRectangle(color, width, height));
            }
            else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shape.add(new AbstrataCircle(color, radius));
            }
        }

        System.out.println();
        System.out.println("------SHAPE AREAS------");
        for (AbstrataShape s: shape) {
            System.out.printf("%.2f%n", s.area());
        }
    }


}
