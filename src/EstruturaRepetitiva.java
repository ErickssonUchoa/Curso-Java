import java.util.Scanner;

public class EstruturaRepetitiva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



//         --> WHILE <--
//         Repete enquanto uma condição for verdadeira
//         Usar quando: Não saber previamente a quantidade de repetições realizadas
//         while (condição) { }
//
//        int x = sc.nextInt();
//        int soma = 0;
//        while (x != 0) {
//            soma += x;
//            System.out.println("Digite outro número");
//            x = sc.nextInt();
//        }
//        System.out.printf("Programa Finalizado, valor total da soma = %d%n", soma);
//
//         --> FOR <--
//         Repete um bloco  de comando para um certo intervalo de valores (baseado em uma contagem)
//         Usar: quando se sabe previamente a quantidade de repetições ou intervalo de valores
//         for (início ; condição ; incremento) {
//         início -> execura somente pela primeira vez
//         condição -> quando verdadeiro executa e volta, falso sai do laço
//         incremento -> executa toda vez depois de voltar

//        int n = sc.nextInt();
//        int soma = 0;
//        for (int i=0; i<n ; i++) {
//            int x = sc.nextInt();
//            soma = soma + x;
//
//        }
//        System.out.println(soma);
//
//        // --> DO WHILE <--
//        // Menos utilizada, mas se encaixa melhor em alguns casos
//        // Bloco de comando executa pelo menos umas vez
//        // Condição verificada no final
//
//        char resp;
//        do {
//            System.out.print("Digite a temperatura em Celsius: ");
//            double C = sc.nextDouble();
//            double F = 9.0 * C / 5.0 + 32.0;
//            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
//            System.out.print("Deseja repetir (s/n)? ");
//            resp = sc.next().charAt(0);
//        } while (resp != 'n');

          sc.close();
    }
}
