package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Conta {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountName = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char verification = sc.next().charAt(0);
        verification = Character.toLowerCase(verification);

        if (verification == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, accountName, initialDeposit);
        }
        else {
            account = new Account(accountNumber, accountName);
        }

        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.depositAccount(deposit);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdrawAccount(withdraw);
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();

    }

}
