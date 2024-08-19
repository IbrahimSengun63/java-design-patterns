package observer;

public class MobileAppListener implements Subscriber{
    @Override
    public void update() {
        System.out.println("Mobile App Listener: Event received and processed.");
    }
}
