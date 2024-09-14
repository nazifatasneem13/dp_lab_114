public class NotificationService {
    public void sendNotification(String message, Rider rider)
    {
        System.out.println("Notification for " + rider.getName() + ": " + message);
    }
}
