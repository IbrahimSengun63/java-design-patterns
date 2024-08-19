package observer;

import java.util.ArrayList;
import java.util.List;

class Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    // Example method that triggers notifications
    public void eventHappened() {
        System.out.println("Event happened, notifying subscribers...");
        notifySubscribers();
    }
}
