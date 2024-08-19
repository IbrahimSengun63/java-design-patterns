package observer;

public class EmailMsgListener implements Subscriber {
    @Override
    public void update() {
        System.out.println("Email Message Listener: Event received and processed.");
    }
}
