public abstract class RideType
{
    protected String type;
    public RideType(String type)
    {
        this.type = type;
    }
    public abstract double calculateFare(int distance);

    public String getType()
    {
        return type;
    }
}