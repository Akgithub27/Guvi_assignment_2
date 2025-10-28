package account;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(1000);
        account.deposit(3000);
        account.displayBalance();
        account.withdraw(500);
        account.displayBalance();
    }
}
