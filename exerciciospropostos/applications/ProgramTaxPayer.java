package cursonelioalves.exerciciospropostos.applications;

import cursonelioalves.exerciciospropostos.entities.Company;
import cursonelioalves.exerciciospropostos.entities.Individual;
import cursonelioalves.exerciciospropostos.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramTaxPayer {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of taxpayers: ");
        int N = scanner.nextInt();

        List<TaxPayer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            System.out.print("Taxpayer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = scanner.next().charAt(0);
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Anual income: ");
            Double anualIncome = scanner.nextDouble();
            if (type == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = scanner.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = scanner.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer tp : list) {
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
        }
        System.out.println();
        double sum = 0.0;
        for (TaxPayer tp : list) {
            sum += tp.tax();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
        scanner.close();
    }
}
