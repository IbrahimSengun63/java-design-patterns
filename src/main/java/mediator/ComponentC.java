package mediator;

class ComponentC extends Component {
    public ComponentC(Mediator mediator) {
        super(mediator);
    }

    public void executeC() {
        System.out.println("ComponentC is executing.");
        mediator.execute(this, "C");
    }
}