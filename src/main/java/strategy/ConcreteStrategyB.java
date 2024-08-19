package strategy;

public class ConcreteStrategyB implements Strategy{
    @Override
    public void doSomething(String data) {
        System.out.println("ConcreteStrategyB: " + data.toLowerCase());
    }
}
