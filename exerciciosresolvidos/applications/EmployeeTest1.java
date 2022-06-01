package cursonelioalves.exerciciosresolvidos.applications;

import cursonelioalves.exerciciosresolvidos.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeTest1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = sc.nextLine();
        System.out.println("What is you Gross Salary? ");
        double grossSalary = sc.nextDouble();
        System.out.println("What is the Tax? ");
        double tax = sc.nextDouble();

        System.out.println("Employee: " + name + ", Gross Salary: $ " + grossSalary);
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        double netSalary = Employee.increaseSalary(percentage, grossSalary, tax);
        System.out.println("Updated data: " + name + ", Net Salary: $ " + Employee.increaseSalary(percentage, grossSalary, tax));
    }
}
