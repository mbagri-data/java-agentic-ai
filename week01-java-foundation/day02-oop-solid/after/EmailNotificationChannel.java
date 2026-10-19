public class EmailNotificationChannel implements    NotificationChannel {
    @Override
    public void sendNotification(String receipts, String message) {
        // Logic to send email notification
        System.out.println("Sending email notification: "+receipts + message);
    }
}