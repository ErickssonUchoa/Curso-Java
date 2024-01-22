package exercises;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ExMap {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria"); //inserir
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "74988012345");
//      cookies.remove("phone"); - remove chave e valor
        cookies.put("phone", "98788123234"); // vai sobrescrever, Map não admite repetição de chave

        System.out.println("contains: " + cookies.containsKey("email"));
        System.out.println("Get: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("----------- DADOS -----------");
        for (String key: cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
        System.out.println("-------------");
        for (String value : cookies.values()) {
            System.out.println(value);
        }

        sc.close();
    }
}
