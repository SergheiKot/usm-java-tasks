package md.usm.javatasks;

import md.usm.javatasks.beans.CreditLimitCalculator;

import java.util.Scanner;

public class CreditLimitCalculatorTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CreditLimitCalculator creditCalculator = new CreditLimitCalculator();

        char cont = 'y';

        while (cont != 'n') {

            System.out.print("Enter customer account number: ");
            creditCalculator.setAccountNumber(scanner.nextInt());

            System.out.print("Enter start balance for account " + creditCalculator.getAccountNumber() + ": ");
            creditCalculator.setStartBalance(scanner.nextInt());

            System.out.print("Enter total monthly charges for account " + creditCalculator.getAccountNumber() + ": ");
            creditCalculator.setTotalCharges(scanner.nextInt());

            System.out.print("Enter total monthly credits for account " + creditCalculator.getAccountNumber() + ": ");
            creditCalculator.setTotalCredits(scanner.nextInt());

            System.out.print("Enter credit limit for account " + creditCalculator.getAccountNumber() + ": ");
            creditCalculator.setCreditLimit(scanner.nextInt());

            System.out.println("Starting balance: " + creditCalculator.getStartBalance());
            System.out.println("Credit Limit: " + creditCalculator.getCreditLimit());
            System.out.println("Total Charges: " + creditCalculator.getTotalCharges());
            System.out.println("Total Credits: " + creditCalculator.getTotalCredits());
            System.out.println("New Balance: " + creditCalculator.getNewBalance());

            if (creditCalculator.isCreditExceeded()) {
                System.out.println("Credit limit exceeded.");
            }

            System.out.print("Calculate credit for another account? (y/n): ");
            cont = scanner.next().charAt(0);
        }
    }
}