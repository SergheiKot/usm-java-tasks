package md.usm.javatasks.beans;

public class CreditLimitCalculator {

    private int accountNumber, startBalance, totalCharges, totalCredits, creditLimit;

    public CreditLimitCalculator() {
    }

    public CreditLimitCalculator(int accountNumber, int startBalance,
                                 int totalCharges, int totalCredits, int creditLimit){
        this.accountNumber = accountNumber;
        this.startBalance = startBalance;
        this.totalCharges = totalCharges;
        this.totalCredits = totalCredits;
        this.creditLimit = creditLimit;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setStartBalance(int startBalance) {
        this.startBalance = startBalance;
    }

    public int getStartBalance() {
        return startBalance;
    }

    public void setTotalCharges(int totalCharges) {
        this.totalCharges = totalCharges;
    }

    public int getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getNewBalance() {
        return getStartBalance() - getTotalCharges() + getTotalCredits();
    }

    public boolean isCreditExceeded() {
        return getNewBalance() <= getCreditLimit();
    }
}
