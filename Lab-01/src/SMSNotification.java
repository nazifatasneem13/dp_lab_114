public class SMSNotification implements Notification {
    @Override
    public void sendNotification(String message, Rider userContact) {
        System.out.println("Sending SMS to " + userContact + ": " + message);
    }
}