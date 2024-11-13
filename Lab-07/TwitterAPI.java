import java.util.List;

class TwitterAPI implements SocialMediaAPI {
    @Override
    public List<String> getNotifications() {
        // Mock data for Twitter notifications
        return List.of("Twitter: New follower", "Twitter: New mention");
    }

    @Override
    public void markAsRead(String notificationId) {
        System.out.println("Twitter: Marked notification '" + notificationId + "' as read.");
    }

    @Override
    public void deleteNotification(String notificationId) {
        System.out.println("Twitter: Deleted notification '" + notificationId + "'.");
    }
}