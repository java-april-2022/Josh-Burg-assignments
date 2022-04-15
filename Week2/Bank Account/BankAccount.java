public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;

    public static int numOfAccounts = 0;
    public static double moneyTotal = 0;

    // Constructor ?
    public BankAccount() {
        BankAccount.numOfAccounts++;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }

    // getter for checking account
    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    // getter for savings account
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void deposit(double amount, String account ) {
        if (account == "checking"){
            this.checkingBalance += amount;
        }
        else {
            this.savingsBalance += amount;
        }
        moneyTotal += amount;
    }

    // withdraw method
    public void withdraws(double amount, String account) {
        boolean withdraw = false;

        if (account == "checking") {
            if (this.checkingBalance - amount >= 0){
                withdraw = true;
                this.checkingBalance -= amount;
            }
        }
        else {
            if(this.savingsBalance - amount >= 0){
                withdraw = true;
                this.savingsBalance -= amount;
            }
        }
        if (withdraw = true) {
            moneyTotal -= amount;
        }

        System.out.println("Insufficient funds!");
    }

    public void total() {
        System.out.println("Checking Account: " + this.checkingBalance);
        System.out.println("Savings Account: " + this.savingsBalance);
        System.out.println("Total Amount: " + moneyTotal);
    }
}