package md.usm.javatasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Please, enter the second number: ");
        int secondNumber = input.nextInt();

        if (firstNumber != secondNumber) {
            System.out.println((firstNumber > secondNumber ? firstNumber : secondNumber) + " is larger");
        } else {
            System.out.println("These numbers are equal");
        }
    }
}