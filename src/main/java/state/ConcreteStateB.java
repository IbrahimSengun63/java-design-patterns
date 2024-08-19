package state;

public class ConcreteStateB implements State{
    @Override
    public void doSomething(Context context) {
        System.out.println("ConcreteStateB is handling doSomething.");
    }

    @Override
    public void doMoreStuff(Context context) {
        System.out.println("ConcreteStateB is handling doMoreStuff.");
        context.setState(new ConcreteStateA());
    }
}
