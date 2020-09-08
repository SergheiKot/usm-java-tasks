package md.usm.javatasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Please, enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Please, enter the third number: ");
        int thirdNumber = input.nextInt();

        int maxNumber;
        int minNumber;

        if (firstNumber > secondNumber) {
            maxNumber = firstNumber;
        } else {
            maxNumber = secondNumber;
        }
        if (thirdNumber > maxNumber) {
            maxNumber = thirdNumber;
        }

        if (firstNumber < secondNumber) {
            minNumber = firstNumber;
        } else {
            minNumber = secondNumber;
        }
        if (thirdNumber < minNumber) {
            minNumber = thirdNumber;
        }

        int sum = firstNumber + secondNumber + thirdNumber;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / 3));
        System.out.println("Product: " + (firstNumber * secondNumber * thirdNumber));
        System.out.println("Smallest of the numbers: " + minNumber);
        System.out.println("Largest of the numbers: " + maxNumber);
    }
}