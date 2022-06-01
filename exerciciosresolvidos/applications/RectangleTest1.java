package cursonelioalves.exerciciosresolvidos.applications;

import cursonelioalves.exerciciosresolvidos.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class RectangleTest1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        double height = sc.nextDouble();

        double area = Rectangle.area(width, height);
        System.out.printf("AREA = %.2f\n", area);
        double perimeter = Rectangle.perimeter(width, height);
        System.out.printf("PERIMETER = %.2f\n", perimeter);
        double diagonal = Rectangle.diagonal(width, height);
        System.out.printf("DIAGONAL = %.2f\n", diagonal);
    }
}
