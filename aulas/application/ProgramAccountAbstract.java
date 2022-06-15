package cursonelioalves.aulas.application;

import cursonelioalves.aulas.entities.Account;
import cursonelioalves.aulas.entities.BusinessAccount;
import cursonelioalves.aulas.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramAccountAbstract {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 1000.00, 0.1));
        list.add(new BusinessAccount(1002, "Anna", 500.00, 300.00));
        list.add(new SavingsAccount(1003, "Bob", 700.00, 0.1));
        list.add(new BusinessAccount(1004, "Maria", 800.00, 400.00));

        double sum = 0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.printf("Total Balance: %.2f\n", sum);

        for (Account acc : list) {
            acc.deposit(10.00);
        }

        for (Account acc : list) {
            System.out.printf("Updated balance for account: %d: %.2f\n", acc.getNumber(), acc.getBalance());
        }
    }
}
