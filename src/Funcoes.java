import java.util.Scanner;

public class Funcoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números para saber qual o maior: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);
        showResult(higher);

    }

    // --> FUNÇÕES <--

    // Em orientação a objetos as funções em classes recebe o nome de "métodos"
    // Quando a função não retorna nenhum valor a ser reaproveitado o tipo que vai retornar é "void" vazio.


    public static int max(int x, int y, int z) {
        int aux;
        if ( x > y && x > z) {
            aux = x;
        }
        else if ( y > z) {
            aux = y;
        }
        else {
            aux = z;
        }

        return aux;
    }

    public static void showResult(int value) {
        System.out.printf("Higher = %d%n", value);
    }
}
