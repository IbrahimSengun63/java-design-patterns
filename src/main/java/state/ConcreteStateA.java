package state;

public class ConcreteStateA implements State{
    @Override
    public void doSomething(Context context) {
        System.out.println("ConcreteStateA is handling doSomething.");
        context.setState(new ConcreteStateB());
    }

    @Override
    public void doMoreStuff(Context context) {
        System.out.println("ConcreteStateA is handling doMoreStuff.");
    }
}
