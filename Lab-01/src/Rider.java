public class Rider extends User
{
    public PaymentMethod preferredPaymentMethod;
    public Rider(int id, String name, String location, double rating,PaymentMethod preferredPaymentMethod)
    {
        super(id,name,location,rating);
        this.preferredPaymentMethod = preferredPaymentMethod;
    }
    public Trip requestRide(String pickupLocation, String dropoffLocation, RideType rideType, int distance)
    {
        System.out.println(name + " requested a " + rideType + " ride.");
        new NotificationService(new EmailNotification()).sendNotification("Ride requested.", this);
        return new Trip(this, pickupLocation, dropoffLocation, rideType, distance, preferredPaymentMethod);
    }
    public void rateDriver(Driver driver, int rating)
    {
        driver.setRating((driver.getRating() + rating) / 2);
        System.out.println(name + " rated driver " + driver.getName() + " with " + rating + " stars.");
    }
    public void makePayment(Trip trip)
    {
        trip.getPaymentMethod().processPayment(trip.getFare());
    }
    public PaymentMethod getPreferredPaymentMethod()
    {
        return preferredPaymentMethod;
    }
    @Override
    public String getUserType()
    {
        return "Rider";
    }

}
