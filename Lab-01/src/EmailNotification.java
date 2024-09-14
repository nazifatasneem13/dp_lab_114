public class EmailNotification implements Notification {
    @Override
    public void sendNotification(String message, Rider userContact) {
        System.out.println("Sending Email to " + userContact + ": " + message);
    }
}