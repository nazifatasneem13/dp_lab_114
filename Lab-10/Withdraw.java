public class Withdraw implements Command{
    double amount;
    Account account;
    String accountNumber;
    public Withdraw(Account account, double amount, String accountNumber)
    {
        this.account=account;
        this.amount=amount;
        this.accountNumber=accountNumber;
    }
    @Override
    public void execute()
    {
        account.withdraw(amount);
    }
}
