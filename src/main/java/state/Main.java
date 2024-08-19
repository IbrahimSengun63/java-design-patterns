package state;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.doThis();  // Output: ConcreteStateA is handling doSomething.
        context.doThat();  // Output: ConcreteStateA is handling doMoreStuff.

        context.doThis();  // Output: ConcreteStateB is handling doSomething.
        context.doThat();  // Output: ConcreteStateB is handling doMoreStuff.

        context.doThis();  // Output: ConcreteStateA is handling doSomething.
    }
}
