public class Trip {
    private Rider rider;
    private String pickupLocation;
    private String dropoffLocation;
    private String rideType;
    private String status;
    private double fare;
    private Driver driver;
    private int distance;

    public Trip(Rider rider, String pickupLocation, String dropoffLocation, String rideType, int distance)
    {
        this.rider = rider;
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
        this.rideType = rideType;
        this.status = "Requested";
        this.fare = calculateFare(distance);

    }

    private double calculateFare(int distance)
    {
        this.distance = distance;
        return distance * 10;
    }


    public void assignDriver(Driver driver)
    {
        this.driver = driver;
        this.status = "Assigned";
        new NotificationService().sendNotification("Driver assigned", rider);
    }

    public void completeTrip()
    {
        this.status = "Completed";
        new NotificationService().sendNotification("Trip completed", rider);
    }

}
