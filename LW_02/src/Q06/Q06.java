
package Q06;

import java.util.*;
import java.time.*;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter born year: ");
        int birthYear = scanner.nextInt();
        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println("You were born in " + birthYear + " and will be " + age + " this year.");
        scanner.close();
    }
}
