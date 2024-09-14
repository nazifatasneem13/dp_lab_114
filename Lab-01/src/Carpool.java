public class Carpool extends RideType
{
    public Carpool()
    {
        super("Carpool");
    }
    @Override
    public double calculateFare(int distance)
    {
        return distance * 60;
    }
}