import java.util.ArrayList;
import java.util.List;

public class Account {
    String accountNumber;
    double balance;
    List<String> transactionHistory = new ArrayList<>();
    public Account(String accountNumber, double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        transactionHistory.add("Account created with balance: " + balance);
    }
    public void deposit(double amount)
    {
        balance+=amount;
        transactionHistory.add("Deposited balance: " + balance);
        System.out.println("Deposited "+amount);
    }
    public void withdraw(double amount)
    {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.add("Withdrawn balance: " + amount);
        }
    }


    public double showBalance()
    {
        return balance;
    }
    public List<String> showTransaction()
    {
        return transactionHistory;
    }

}
