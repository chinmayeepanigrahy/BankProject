package bank;

public class Account {

  
    private final String owner;
    private int balance;

    public Account(String owner) {
        this.owner = owner;
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("not enough money");
        }
    }

    public void transferTo(int amount, Account other) {
        if (amount <= balance) {
            this.balance = this.balance - amount;
            other.balance = other.balance + amount;
        } else {
            System.out.println("not enough money");
        }
    }

    public String getOwner() {
        return owner;
    }
}
