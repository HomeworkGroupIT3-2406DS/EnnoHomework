package labWork3;

public class Account {
    private String id;
    private double balance;

    public Account() {
        this.id = "";
        this.balance = 0.0;
    }

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean debit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Account[id=" + id + ", balance=" + balance + "]";
    }
}
