public class Driver extends User
{
    private RideType vehicleType;
    private boolean available;
    public Driver(int id, String name, RideType vehicleType, String location, double rating)
    {
        super(id,name,location,rating);
        this.available = true;
        this.vehicleType = vehicleType;
    }
    public void rateRider(Rider rider, int rating)
    {
        rider.setRating((rider.getRating() + rating) / 2);
        System.out.println(name + " rated rider " + rider.getName() + " with " + rating + " stars.");
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
        new NotificationService(new InAppNotification()).sendNotification("Trip completed", trip.rider);
    }
    public boolean isAvailable()
    {
        return available;
    }
    @Override
    public String getUserType()
    {
        return "Driver";
    }

}
