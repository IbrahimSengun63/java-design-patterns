package mediator;

class ComponentA extends Component {
    public ComponentA(Mediator mediator) {
        super(mediator);
    }

    public void executeA() {
        System.out.println("ComponentA is executing.");
        mediator.execute(this, "A");
    }
}
