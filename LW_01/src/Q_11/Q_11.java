package Q_11;

import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name (First Middle Last): ");
        String input = scanner.nextLine();
        scanner.close();

        String[] nameParts = input.split(" ");

        if (nameParts.length < 2) {
            System.out.println("Error: Please enter at least a first and last name.");
            return;
        }

        String firstName = nameParts[0];
        String lastName = nameParts[nameParts.length - 1];
        String middleInitial = (nameParts.length > 2) ? nameParts[1].charAt(0) + "." : "";

        // Format and display the name
        System.out.println(lastName + ", " + firstName + " " + middleInitial);
    }
}
