public class Admin {
    private int id;
    private String name;
    private String role;

    public Admin(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void manageDriver(Driver driver)
    {
        System.out.println("Admin " + name + " is managing driver " + driver.getName());
    }

    public void manageRider(Rider rider)
    {
        System.out.println("Admin " + name + " is managing rider " + rider.getName());
    }

    public void viewTripHistory(Trip trip)
    {
        System.out.println("Admin " + name + " is viewing trip history");
    }

    public void handleDispute(Rider rider, Driver driver)
    {
        System.out.println("Admin " + name + " is handling a dispute between " + rider.getName() + " and " + driver.getName());
    }
}
