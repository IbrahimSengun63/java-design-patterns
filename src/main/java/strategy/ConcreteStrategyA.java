package strategy;

public class ConcreteStrategyA implements Strategy{
    @Override
    public void doSomething(String data) {
        System.out.println("ConcreteStrategyA: " + data.toUpperCase());
    }
}
