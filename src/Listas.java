import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Ian"); // adicionando elementos na lista
        list.add("Rafa");
        list.add("Elias");
        list.add(2, "Gabigol"); // adicionando elemento na posição desejada
        System.out.println(list.size()); // mostrar tamanho da lista
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("--------------------------------------------");

        list.remove("Gabigol"); // ou list.remove(2) -> remove elemento da posição 2
        list.removeIf(x -> x.charAt(0) == 'E'); // removendo com predicado
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("--------------------------------------------");
        System.out.println("Index of Ian: " + list.indexOf("Ian")); //encontrar posição do elemento
        System.out.println("Index of Elias: " + list.indexOf("Elias"));

        System.out.println("--------------------------------------------");
        // filtar elemento com base em um predicado
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'I').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("--------------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'I').findFirst().orElse(null);
        System.out.println(name);
        String nameNull = list.stream().filter(x -> x.charAt(0) == 'E').findFirst().orElse(null);
        System.out.println(nameNull);
    }
}
