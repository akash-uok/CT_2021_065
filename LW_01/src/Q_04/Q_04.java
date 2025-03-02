package Q_04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q_04 {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy");

        // Format and display the date
        String formattedDate = today.format(formatter);
        System.out.println("Today's date: " + formattedDate);
    }
}
