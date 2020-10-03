package md.usm.javatasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] values = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d: ", i + 1);

            for (int j = 0; j < values[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}