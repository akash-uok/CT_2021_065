package Q_08;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with ! mark: ");
        String input = scanner.next();

        String[] texts = input.split("!");

        if (texts.length <= 1) {
            System.out.println("No '!' mark detected.");
            return;
        }

        if (texts.length > 2) {
            System.out.println("More than 1 '!' mark detected.");
            return;
        }
        for (String text : texts) {
            System.out.println(text);
        }
    }
}
