public class Luxury extends RideType
{
    public Luxury()
    {
        super("Luxury");
    }

    @Override
    public double calculateFare(int distance)
    {
        return distance * 100;
    }
}