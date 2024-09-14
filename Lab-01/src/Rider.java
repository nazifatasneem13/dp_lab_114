public class Rider {
    private int id;
    private String name;
    private String location;
    private double rating;


    public Rider(int id, String name, String location, double rating)
    {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    public Trip requestRide(String pickupLocation, String dropoffLocation, String rideType, int distance)
    {
        System.out.println(name + " requested a " + rideType + " ride.");
        return new Trip(this, pickupLocation, dropoffLocation, rideType, distance);
    }

    public void rateDriver(Driver driver, int rating)
    {
        driver.setRating((driver.getRating() + rating) / 2);
        System.out.println(name + " rated driver " + driver.getName() + " with " + rating + " stars.");
    }

    public String getName()
    {
        return name;
    }
    public void setRating(double rating)
    {
        this.rating = rating;
    }
    public double getRating()
    {
        return rating;
    }
}
