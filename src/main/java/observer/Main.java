package observer;

public class Main {
    public static void main(String[] args) {
        Publisher notificationService = new Publisher();

        Subscriber emailListener = new EmailMsgListener();
        Subscriber appListener = new MobileAppListener();

        notificationService.subscribe(emailListener);
        notificationService.subscribe(appListener);

        // Simulate an event
        notificationService.eventHappened();

        // Unsubscribe a listener and trigger another event
        notificationService.unsubscribe(emailListener);
        notificationService.eventHappened();

    }
}
