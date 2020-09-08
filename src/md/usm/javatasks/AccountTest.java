package md.usm.javatasks;

import md.usm.javatasks.beans.Account;

public class AccountTest {
    public static void main(String[] args) {
        Account firstAccount = new Account("Jane Green", 50.00);
        Account secondAccount = new Account("John Blue", 30.00);

        System.out.println("Balance of the " + firstAccount.getName() + " before withdraw: " + firstAccount.getBalance());
        firstAccount.withdraw(60.00);
        System.out.println("Balance of the " + firstAccount.getName() + " after withdraw: " + firstAccount.getBalance() + "\n");

        System.out.println("Balance of the " + secondAccount.getName() + " before withdraw: " + secondAccount.getBalance());
        secondAccount.withdraw(20.00);
        System.out.println("Balance of the " + secondAccount.getName() + " after withdraw: " + secondAccount.getBalance());
    }
}