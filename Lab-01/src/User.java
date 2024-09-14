public abstract class User
{
    protected int id;
    protected String name;
    protected String location;
    protected double rating;
    public User(int id, String name, String location, double rating)
    {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
    }
    public String getName()
    {
        return name;
    }
    public double getRating()
    {
        return rating;
    }
    public void setRating(double rating)
    {
        this.rating = rating;
    }
    public abstract String getUserType();
}
