package Q05;

import java.util.*;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Temperature in Celsius: " + celsius);

        scanner.close();
    }
}
