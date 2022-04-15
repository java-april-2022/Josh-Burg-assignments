public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount platinum = new BankAccount();

        platinum.deposit(100, "checking");
        platinum.deposit(250, "savings");
        platinum.withdraws(300, "checking");


        System.out.println(BankAccount.numOfAccounts);
        System.out.println(platinum.getCheckingBalance());
        System.out.println(platinum.getSavingsBalance());
        platinum.total();
    }
}
