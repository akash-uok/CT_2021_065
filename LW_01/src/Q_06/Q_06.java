package Q_06;

import javax.swing.*;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Frame Width: ");
        int width = Integer.parseInt(scanner.next());
        System.out.println("Enter Frame Height: ");
        int height = Integer.parseInt(scanner.next());

        System.out.println("Enter Frame Title: ");
        String title = scanner.next();
        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(width, height);
        myWindow.setTitle(title);
        myWindow.setVisible(true);
    }
}
