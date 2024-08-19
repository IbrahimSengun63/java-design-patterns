package state;

public class Context {
    private State state;

    public Context() {
        this.state = new ConcreteStateA(); // Initial state
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doThis() {
        state.doSomething(this);
    }

    public void doThat() {
        state.doMoreStuff(this);
    }
}
