public class DigitalWallet implements PaymentMethod
{
    @Override
    public void processPayment(double amount)
    {
        System.out.println("Digital Wallet: Processing payment of $" + amount);
    }
}