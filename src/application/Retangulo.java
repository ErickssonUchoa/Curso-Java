package application;

import java.util.Locale;
import java.util.Scanner;
import util.Rectangle;

public class Retangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Digite a largura do retângulo: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Digite a Altura do retângulo: ");
        rectangle.height = sc.nextDouble();
        System.out.println(rectangle);

        sc.close();
    }


}
