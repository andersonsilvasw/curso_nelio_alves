package cursonelioalves.exerciciosresolvidos.entities;

public class Rectangle {
    public static double area (double width, double height) {
        return width * height;
    }

    public static double perimeter (double width, double height) {
        return width + width + height + height;
    }

    public static double diagonal (double width, double height) {
        return Math.sqrt((width * width) + (height * height));
    }
}
