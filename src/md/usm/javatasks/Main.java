package md.usm.javatasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of values to sort: ");
        int numValues = scanner.nextInt();

        System.out.print("Enter values: ");
        int smallest = scanner.nextInt();

        while (numValues > 1) {

            System.out.print("Enter values: ");
            smallest = Math.min(scanner.nextInt(), smallest);

            numValues--;
        }

        System.out.println("The smallest value is " + smallest);
    }
}