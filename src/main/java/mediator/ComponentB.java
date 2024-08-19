package mediator;

class ComponentB extends Component {
    public ComponentB(Mediator mediator) {
        super(mediator);
    }

    public void executeB() {
        System.out.println("ComponentB is executing.");
        mediator.execute(this, "B");
    }
}

