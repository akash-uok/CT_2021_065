package Q_10;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String input = scanner.nextLine();

        int input_len = input.length();

        if (input_len % 2 == 0) {
            System.out.println("Even input can not process.");
            return;
        }
        System.out.println("Middle Letter: "+input.charAt(input_len/2 ));
    }
}
