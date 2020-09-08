package md.usm.javatasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Please, enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.println("Sum: " + (firstNumber + secondNumber));
        System.out.println("Product: " + (firstNumber * secondNumber));
        System.out.println("Difference: " + (firstNumber - secondNumber));
        System.out.println("Quotient: " + (firstNumber / secondNumber));
    }
}