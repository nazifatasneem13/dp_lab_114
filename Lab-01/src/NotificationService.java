public class NotificationService {
    private Notification notificationMethod;

    public NotificationService(Notification notificationMethod) {
        this.notificationMethod = notificationMethod;
    }

    public void sendNotification(String message, Rider userContact) {
        notificationMethod.sendNotification(message, userContact);
    }
}