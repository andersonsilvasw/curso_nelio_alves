package cursonelioalves.exerciciospropostos.applications;

import cursonelioalves.exerciciospropostos.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class AccountTest1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Account account;

        System.out.println("Enter account number: ");
        int number = scanner.nextInt();
        System.out.println("Enter account holder: ");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.println("Is there an initial deposit (y/n)? ");
        char response = scanner.next().charAt(0);
        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = scanner.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = scanner.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = scanner.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        scanner.close();
    }
}
