package Q08;

import java.util.*;

public class Q08 {
public static void main(String[] args) {
    System.out.print("Enter the radius of the sphere: ");
    Scanner scanner = new Scanner(System.in);
    double radius = scanner.nextDouble();
    scanner.close();
    double pi = 3.14;
    double volume = (4.0 / 3.0) * pi * Math.pow(radius, 3);

    System.out.println("The volume of the sphere: " + volume);
}
}
