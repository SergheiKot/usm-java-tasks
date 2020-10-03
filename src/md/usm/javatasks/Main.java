package md.usm.javatasks;

import java.util.Scanner;

public class Main {

    private static final int[] array = new int[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int number;

        while (counter != 5) {
            System.out.printf("Enter value %d/5 between 10 and 100: ", counter + 1);
            number = scanner.nextInt();

            if (number < 10 || number > 100) {
                continue;
            }

            if (isNumberUnique(number)) {
                System.out.println("Unique value: " + number);
            }

            try {
                array[counter++] = number;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Internal error!");
            }

            System.out.print("\nUnique values: ");

            System.out.print(array[0] + " ");

            int unique = 0;

            for (int i = 1; i < array.length; i++) {
                if (array[i] > 0) {
                    for (int j = i - 1; j >= 0; j--) {
                        if (array[i] == array[j]) {
                            unique = 0;
                            break;
                        } else {
                            unique = array[i];
                        }
                    }
                    if (unique > 0) {
                        System.out.print(unique + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static boolean isNumberUnique(int number) {
        for (int value : array) {
            if (value == number) {
                return false;
            }
        }
        return true;
    }
}