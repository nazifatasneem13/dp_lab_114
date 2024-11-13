import java.util.List;

public class SocialMediaAggregator {
    public static void main(String[] args) {
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade();

        // Get all notifications
        List<String> notifications = socialMediaFacade.getAllNotifications();
        System.out.println("All Notifications:");
        notifications.forEach(System.out::println);

        // Interact with notifications
        socialMediaFacade.markNotificationAsRead("1", "twitter");
        socialMediaFacade.deleteNotification("2", "facebook");
    }
}
