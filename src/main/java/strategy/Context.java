package strategy;

public class Context {
    private Strategy strategy;

    // Method to set the strategy
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // Method that uses the strategy
    public void doThis(String data) {
        strategy.doSomething(data);
    }
}