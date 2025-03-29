package Q09;

import java.util.*;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate in percentage: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double amount = principal * Math.pow(1 + (rate / 100), years);

        System.out.printf("The amount of money earned after" +years+ " years is: %.2f%n dollars",  amount);

        scanner.close();
    }

}
