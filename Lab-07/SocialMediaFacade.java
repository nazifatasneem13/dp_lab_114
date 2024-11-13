import java.util.ArrayList;
import java.util.List;

class SocialMediaFacade {
    private SocialMediaAPI twitterAPI;
    private SocialMediaAPI facebookAPI;
    private SocialMediaAPI linkedInAPI;

    public SocialMediaFacade() {
        this.twitterAPI = new TwitterAPI();
        this.facebookAPI = new FacebookAPI();
        this.linkedInAPI = new LinkedInAPI();
    }

    public List<String> getAllNotifications() {
        List<String> allNotifications = new ArrayList<>();
        allNotifications.addAll(twitterAPI.getNotifications());
        allNotifications.addAll(facebookAPI.getNotifications());
        allNotifications.addAll(linkedInAPI.getNotifications());
        return allNotifications;
    }

    public void markNotificationAsRead(String notificationId, String platform) {
        switch (platform.toLowerCase()) {
            case "twitter":
                twitterAPI.markAsRead(notificationId);
                break;
            case "facebook":
                facebookAPI.markAsRead(notificationId);
                break;
            case "linkedin":
                linkedInAPI.markAsRead(notificationId);
                break;
            default:
                System.out.println("Platform not supported.");
        }
    }
    public void deleteNotification(String notificationId, String platform) {
        switch (platform.toLowerCase()) {
            case "twitter":
                twitterAPI.deleteNotification(notificationId);
                break;
            case "facebook":
                facebookAPI.deleteNotification(notificationId);
                break;
            case "linkedin":
                linkedInAPI.deleteNotification(notificationId);
                break;
            default:
                System.out.println("Platform not supported.");
        }
    }
}