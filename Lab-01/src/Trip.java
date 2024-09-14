public class Trip
{
    public Rider rider;
    public String pickupLocation;
    public String dropoffLocation;
    private RideType rideType;
    private String status;
    private double fare;
    private Driver driver;
    private int distance;
    private PaymentMethod paymentMethod;

    public Trip(Rider rider, String pickupLocation, String dropoffLocation, RideType rideType, int distance, PaymentMethod paymentMethod)
    {
        this.rider = rider;
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
        this.rideType = rideType;
        this.status = "Requested";
        this.fare = calculateFare(distance);
        this.paymentMethod = paymentMethod;
    }
    private double calculateFare(int distance)
    {
        this.distance = distance;
        return rideType.calculateFare(distance);
    }
    public void assignDriver(Driver driver)
    {
        this.driver = driver;
        this.status = "Assigned";
        new NotificationService(new SMSNotification()).sendNotification("Driver assigned", rider);
    }
    public void completeTrip()
    {
        this.status = "Completed";
        rider.makePayment(this);
        new NotificationService(new SMSNotification()).sendNotification("Trip completed", rider);
    }
    public PaymentMethod getPaymentMethod()
    {
        return paymentMethod;
    }
    public double getFare()
    {
        return fare;
    }

}
