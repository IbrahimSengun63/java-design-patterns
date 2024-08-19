package mediator;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ComponentA componentA = new ComponentA(mediator);
        ComponentB componentB = new ComponentB(mediator);
        ComponentC componentC = new ComponentC(mediator);

        mediator.setComponentA(componentA);
        mediator.setComponentB(componentB);
        mediator.setComponentC(componentC);

        componentA.executeA(); // Start the interaction with ComponentA
    }
}

