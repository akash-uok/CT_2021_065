package Q07;

import java.util.*;


public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        int weight = scanner.nextInt();

        System.out.print("Enter height in cm: ");
        int height = scanner.nextInt();

        double bmi = weight / Math.pow(height / 100.0, 2);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (bmi >= 20 && bmi <= 25) {
            System.out.println("Your BMI is  normal.");
        } else {
            System.out.println("Your BMI is outside the normal range.");
        }

        scanner.close();
    }
}

