public class Deposit implements Command{
    double amount;
    Account account;
    String accountNumber;
    public Deposit(Account account, double amount, String accountNumber)
    {
        this.account=account;
        this.amount=amount;
        this.accountNumber=accountNumber;
    }
    @Override
    public void execute()
    {
        account.deposit(amount);
    }
}
