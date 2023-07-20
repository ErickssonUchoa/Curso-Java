package application;

import entities.ContaHeranca;
import entities.ContaEmpresaHeranca;
import entities.ContaPoupanca;

import java.util.Locale;
import java.util.Scanner;

public class Heranca {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaHeranca acc = new ContaHeranca(1001, "Alex", 0.0);
        ContaEmpresaHeranca bacc = new ContaEmpresaHeranca(1002, "maria", 0.0, 500.00);

        //UPCASTING - EX: pegar objeto do tipo ContaEmpresa e atribuir pra uma variável do tipo Conta herança
        ContaHeranca acc1 = bacc;
        ContaHeranca acc2 = new ContaEmpresaHeranca(1003, "bob", 0.0, 400.00);
        ContaHeranca acc3 = new ContaPoupanca(1004, "ana", 0.0, 300.00);

        //DOWNCASTING - aqui o casting deve ser manual
        ContaEmpresaHeranca acc4 = (ContaEmpresaHeranca) acc2;
        acc4.loan(100.0);

        // ContaEmpresaHeranca acc5 = (ContaEmpresaHeranca) acc3; // não da certo, só vai saber na hora da execução
        if (acc3 instanceof ContaEmpresaHeranca) {
            ContaEmpresaHeranca acc5 = (ContaEmpresaHeranca) acc3;
            acc5.loan(200.0);
        }

        if (acc3 instanceof ContaPoupanca) {
            ContaPoupanca acc5 = (ContaPoupanca)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }







    }
}
