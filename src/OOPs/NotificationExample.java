package OOPs;

public class NotificationExample {
    public static void main(String[] args) {
        NotificationService emailService=new EmailService("aman@gmail.com");
        NotificationService messageService=new SMSNotificationService("+91 1234567890");
        emailService.sendNotifications("Hello, this is an email notification.");
        messageService.sendNotifications("Hi there, this is an SMS notification.");

        emailService.subscribeToTopic("News");
        messageService.subscribeToTopic("Alerts");
    }

}