package Q02;

import java.util.*;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value in cm: ");
        double cm = scanner.nextDouble();

        double totalInches = cm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println(feet + " ft " + String.format("%.2f", inches) + " in");

        scanner.close();


    }
}
