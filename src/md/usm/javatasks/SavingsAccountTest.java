package md.usm.javatasks;

import md.usm.javatasks.beans.SavingsAccount;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);

        System.out.println("saver1 initial Balance: " + saver1);
        System.out.println("saver2 initial Balance: " + saver2);
        System.out.println();

        for (int i = 0; i < 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        System.out.println("saver1 initial Balance: " + saver1);
        System.out.println("saver2 initial Balance: " + saver2);
        System.out.println("\nIncrease interest rate to 5%\n");

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("saver1 - 1 month at 5% interest: " + saver1);
        System.out.println("saver2 - 1 month at 5% interest: " + saver2);
    }
}