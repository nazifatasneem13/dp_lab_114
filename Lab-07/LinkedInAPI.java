import java.util.List;

class LinkedInAPI implements SocialMediaAPI {
    @Override
    public List<String> getNotifications() {
        // Mock data for LinkedIn notifications
        return List.of("LinkedIn: New connection request", "LinkedIn: New message");
    }

    @Override
    public void markAsRead(String notificationId) {
        System.out.println("LinkedIn: Marked notification '" + notificationId + "' as read.");
    }

    @Override
    public void deleteNotification(String notificationId) {
        System.out.println("LinkedIn: Deleted notification '" + notificationId + "'.");
    }
}