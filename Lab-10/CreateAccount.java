public class CreateAccount implements Command{
    Account account;
    String accountNumber;
    double initialBalance;
    public CreateAccount(String accountNumber, Account account, double initialBalance)
    {
        this.accountNumber=accountNumber;
        this.account=account;
        this.initialBalance=initialBalance;
    }
    @Override
    public void execute()
    {
        account = new Account(accountNumber, initialBalance);
    }
}
