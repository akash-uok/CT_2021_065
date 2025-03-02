package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = scanner.next();
        System.out.println("Enter Middle Name: ");
        String middleName = scanner.next();
        System.out.println("Enter Last Name: ");
        String lastName = scanner.next();
        String Name = firstName + " " + middleName.toUpperCase().charAt(0) + ". " + lastName;
        System.out.println(Name);
    }
}
