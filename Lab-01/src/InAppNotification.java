public class InAppNotification implements Notification {
    @Override
    public void sendNotification(String message, Rider userContact) {
        System.out.println("In-App notification to " + userContact + ": " + message);
    }
}