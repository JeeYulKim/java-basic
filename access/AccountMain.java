package access;

public class AccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(5000);
        account.withdraw(3000);
        System.out.println("balance = " + account.getBalance());
    }
}
