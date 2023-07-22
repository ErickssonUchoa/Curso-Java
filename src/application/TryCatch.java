package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        methodException();

    }

    public static void methodException() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Start---");
        try {
            String[] vector = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vector[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        }
        catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        finally {
            System.out.println("End of program!");
        }
        System.out.println("---End---");
        sc.close();
    }
}
