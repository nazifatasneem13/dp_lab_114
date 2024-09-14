public class Driver {
    private int id;
    private String name;
    private String vehicleType;
    private String location;
    private double rating;
    private boolean available;

    public Driver(int id, String name, String vehicleType, String location)
    {
        this.id = id;
        this.name = name;
        this.vehicleType = vehicleType;
        this.location = location;
        this.rating = 5.0;
        this.available = true;
    }

    public void rateRider(Rider rider, int rating)
    {
        rider.setRating((rider.getRating() + rating) / 2);
        System.out.println(name + " rated driver " + rider.getName() + " with " + rating + " stars.");
    }
    public void updateLocation(String location)
    {
        this.location=location;
        System.out.println("Location has been updated to " + location );
    }

    public void acceptRide(Trip trip)
    {
        available = false;
        trip.assignDriver(this);
        System.out.println("Driver " + name + " accepted the ride.");
    }

    public void startTrip(Trip trip)
    {
        System.out.println("Driver " + name + " started the trip.");
    }

    public void completeTrip(Trip trip)
    {
        available = true;
        System.out.println("Driver " + name + " completed the trip.");
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
