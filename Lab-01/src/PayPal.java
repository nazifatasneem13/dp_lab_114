public class PayPal implements PaymentMethod
{
    @Override
    public void processPayment(double amount)
    {
        System.out.println("PayPal: Processing payment of $" + amount);
    }
}