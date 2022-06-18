package cursonelioalves.aulas.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsAndTryCatch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            String[] vect = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        System.out.println("End of program");
    }
}
