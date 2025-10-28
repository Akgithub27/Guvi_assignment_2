package account;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public Account() {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance+=amount;
        System.out.println("Amount rs "+amount+" deposited to your aacount");
    }

    public void withdraw(double amount){
        if(this.balance <=0){
            System.out.println("your account has no amount");
        }else{
            this.balance-=amount;
        }
        System.out.println("Amount rs "+amount+" debited from aacount");
    }

    public void displayBalance(){
        System.out.println("Your balance is: "+getBalance());
    }
}
