package strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        // Use ConcreteStrategyA
        context.setStrategy(new ConcreteStrategyA());
        context.doThis("Hello Strategy Pattern!");

        // Use ConcreteStrategyB
        context.setStrategy(new ConcreteStrategyB());
        context.doThis("Hello Strategy Pattern!");
    }
}
