package Q_09;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String input = scanner.nextLine();

        int input_len = input.length();

        System.out.println(input_len);
        System.out.println(input.charAt(0));
        System.out.println(input.charAt(input.length() - 1));

    }
}
