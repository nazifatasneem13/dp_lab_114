public class Bike extends RideType
{
    public Bike()
    {
        super("Bike");
    }
    @Override
    public double calculateFare(int distance)
    {
        return distance * 30;
    }
}