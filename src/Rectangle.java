import java.util.Scanner;
import java.lang.Math;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variables
        double length;
        double width;
        double area;
        double perimeter;
        double diagonal;

        // Asking side 1
        System.out.println("Enter the length (positive integer)");
        do {
            if (scan.hasNextDouble()) {

                length = scan.nextDouble();
                if (length > 0) {
                    break;
                }
            }
            scan.nextLine();
            System.out.println("Please enter a valid input");
        } while (true);

        // Asking side 2
        System.out.println("Enter the width (positive integer)");
        do {
            if (scan.hasNextDouble()) {

                width = scan.nextDouble();
                if (width > 0) {
                    break;
                }
            }
            scan.nextLine();
            System.out.println("Please enter a valid input");
        } while (true);

        // Calculations
        area = length*width;
        perimeter = (length*2) + (width*2);
        double pythag = Math.pow(length, 2) + Math.pow(width, 2);
        diagonal = Math.sqrt(pythag);

        System.out.printf("%-7s %.2f","Length:", length);
        System.out.printf("\n%-6s %.2f", "Width:", width);
        System.out.printf("\n%-5s %.2f", "Area:", area);
        System.out.printf("\n%-8s %.2f", "Perimeter", perimeter);
        System.out.printf("\n%-9s %.2f", "Diagonal:", diagonal);
    }
}