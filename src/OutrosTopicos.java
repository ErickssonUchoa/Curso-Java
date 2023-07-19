public class OutrosTopicos {

    public static void main(String[] args) {
//         Camel case em tudo menos em classes
//         começar classes com leta maiuscula (pascal case)
//
//         --> OPERADORES BITWISE <--
//         & -> 'E' bit a bit
//         | 'OU' bit a bit
//         ^ 'OU EXCLUSIVO' bit a bit (não da verdadeiro quando os 2 são verdadeiros, diferente do "ou" normal)
//         programação de baixo nível
//
//         --> FUNÇÕES PARA STRINGS <--
//         Formatar - toLowerCase(), toUpperCase(), trim() - remo espaços
//         Recortar - substring(inicio), substring(inicio,fim)
//         Substituir - Replace(char, char), Replace(String, String)
//         Buscar - indexOf _. primeira ocorrencia, lastIndexOf - ultima ocorrencia
//         str.Split("defenir a separação ",", ".") - recortar string e guardar em vetor

        String original = "abcde FGHIJ ABC abc DEFG    ";
        System.out.println("Original: " + original);
        String s01 = original.toLowerCase();
        System.out.println("toLowerCase: " + s01);
        String s02 = original.toUpperCase();
        System.out.println("toUpperCase: " + s02);
        String s03 = original.trim();
        System.out.println("trim: " + s03);
        String s04 = original.substring(2);
        System.out.println("substring: " + s04);
        String s05 = original.substring(2,9);
        System.out.println("substring: " + s05);
        String s06 = original.replace('a', 'x');
        System.out.println("replace char: " + s06);
        String s07 = original.replace("abcde", "SEXO");
        System.out.println("replace string: " + s07);
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        System.out.println("indexOf: " + i);
        System.out.println("lastIndexOf: " + j);

        String s = "potato apple lemon";
        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

    }
}
