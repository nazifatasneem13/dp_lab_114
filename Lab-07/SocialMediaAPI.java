import java.util.List;

interface SocialMediaAPI {
    List<String> getNotifications();
    void markAsRead(String notificationId);
    void deleteNotification(String notificationId);
}