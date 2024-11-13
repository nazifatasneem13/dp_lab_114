import java.util.List;

class FacebookAPI implements SocialMediaAPI {
    @Override
    public List<String> getNotifications() {
        // Mock data for Facebook notifications
        return List.of("Facebook: New comment", "Facebook: New like");
    }

    @Override
    public void markAsRead(String notificationId) {
        System.out.println("Facebook: Marked notification '" + notificationId + "' as read.");
    }

    @Override
    public void deleteNotification(String notificationId) {
        System.out.println("Facebook: Deleted notification '" + notificationId + "'.");
    }
}