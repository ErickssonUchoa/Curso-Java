import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial {

    public static void main(String[] args) {
        // --> SAÍDA DE DADOS EM JAVA <--

        // Não quebra a linha (print)
        //System.out.print("eu ");
        //System.out.print("sou ");
        //System.out.print("MENGÃO ");

        // Quebra de linha (println)
        //System.out.println("Hi");
        //System.out.println(y);
        //System.out.println(x);

        // printf (formatação para delimitar casas decimais, %n ou \n quebra de linha)
        //System.out.printf("%.2f\n", x);

        // Separador local US (.), no Brasil é (,)
        Locale.setDefault(Locale.US);

        //System.out.printf("%.4f%n", x);

        //Concatenar elementos
        //System.out.println("Resultado = " + x + " Metros");
        //System.out.printf("Resultado = %.2f Metros%n", x);

        // Marcadores de entrada de variáveis: %f(flutuante), %d(int), %s(texto), %n(quebra de linha)
        //String nome = "Maria";
        //int idade = 31;
        //double renda = 4000.0;
        //System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        // --> CASTING <-- (Necessário quando o resultado for de outro tipo (int -> double)
        // a = 5;
        // b = 2;
        // resultado = (double) a / b;

        // --> ENTRADA DE DADOS EM JAVA <--
        // import.java.util.Scanner
        // Scanner sc = new Scanner(System.in);
        // sc.close() -> quando não precisar mais do objeto sc
        Scanner sc = new Scanner(System.in);
        //String entrada;
        // Texto sem espaço --> sc.next
        //entrada = sc.next();
        //System.out.println("Você digitou: " + entrada);

        //Número inteiro --> sc.nextInt
        //int numero;
        //numero = sc.nextInt();
        // System.out.println("Você digitou: " + numero);

        //Número (double) --> sc.nextDouble()
        // double flutuante;
        // flutuante = sc.nextDouble();
        // System.out.println("Você digitou: " + flutuante);

        // ler um caractere (pega o primeiro da string) --> sc.next().chatAt(0)
        // char caractere;
        // caractere = sc.next().charAt(0);
        //System.out.println("Você digitou: " + caractere);

        //Na mesma linha (so fazer sem colocar a saida de dados) --> digitar separado por espaço
        //string x;
        //int y;
        //double z;
        //x = sc.next();
        //y = sc.nextInt();
        //z = sc.nextDouble();

        // Ler até a quebra de linha (vai para variável tipo String)
        //String s1, s2, s3;
        //s1 = sc.nextLine();
        //s2 = sc.nextLine();
        //s3 = sc.nextLine();
        //System.out.println(s1);
        //System.out.println(s2);
        //System.out.println(s3);

        // quebra de linha pendente (fazer sc.nextLine antes do que precisa ser lido)

        sc.close();

        // --> FUNÇÕES MATEMÁTICAS <--
        // Math.sqrt(x) -> raiz quadrada de x
        // Math.pow(x) -> resultado de x elevado a y
        // Math.abs(x) -> valor absoluto de x
        // recomendado usar double
    }
}
