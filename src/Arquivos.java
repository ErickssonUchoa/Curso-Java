import java.io.*;
import java.util.Scanner;

public class Arquivos {

    public static void main(String[] args) {

//        File file = new File("/home/ian/Documentos/teste.txt");
//        Scanner sc = null;
//        try {
//            sc = new Scanner(file);
//            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }
//        }
//        catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        finally {
//            if (sc != null) {
//                sc.close();
//            }
//

// ---------------------- FORMA MANUAL ----------------------

//        String path = "/home/ian/Documentos/teste.txt";
//        FileReader fr = null;
//        BufferedReader br = null;
//
//        try {
//            fr = new FileReader(path);
//            br = new BufferedReader(fr);
//
//            String line = br.readLine();
//
//            while (line != null) {
//                System.out.println(line);
//                line = br.readLine();
//            }
//        }
//        catch(IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        finally {
//            try {
//                if (br != null) {
//                    br.close();
//                }
//                if (fr != null) {
//                    fr.close();
//                }
//            }
//            catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

// ----------------------- FORMA OTMIZADA -----------------------------------------

//        String path = "/home/ian/Documentos/teste.txt";
//        try (BufferedReader br = new BufferedReader((new FileReader(path)))) {
//            String line = br.readLine();
//
//            while (line != null) {
//                System.out.println(line);
//                line = br.readLine();
//            }
//
//        }
//        catch(IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }

        String[] lines = new String[] {"Teste para saber se funcionou adicionado"};

        String path = "/home/ian/Documentos/testando.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
