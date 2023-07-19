package exercises;

import java.util.Locale;

public class exc1 {

    public static void main(String[] args) {

        String product1 = "Computer" , product2 = "Office Desk";
        int age = 30 , code = 5290;
        char gender = 'F';
        double price1 = 2100.0 , price2 = 650.50, measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, witch price is $ %.2f%n ", product1, price1);
        System.out.printf("%s, witch price is $ %.2f%n ", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
        System.out.println();
        System.out.printf("Measure with eight decimal places: %f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.2f%n", measure);

    }
}
