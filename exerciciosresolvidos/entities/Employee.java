package cursonelioalves.exerciciosresolvidos.entities;

public class Employee {
    public static double netSalary (double grossSalary, double tax) {
        return grossSalary - (grossSalary * tax / 100);
    }

    public static double increaseSalary (double percentage, double grossSalary, double tax) {
        return (grossSalary + (grossSalary * percentage / 100)) - tax;
    }
}
