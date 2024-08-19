package mediator;

class ConcreteMediator implements Mediator {
    private ComponentA componentA;
    private ComponentB componentB;
    private ComponentC componentC;
    private boolean isCycleBroken = false;

    public void setComponentA(ComponentA componentA) {
        this.componentA = componentA;
    }

    public void setComponentB(ComponentB componentB) {
        this.componentB = componentB;
    }

    public void setComponentC(ComponentC componentC) {
        this.componentC = componentC;
    }

    @Override
    public void execute(Component sender, String action) {
        if (isCycleBroken) {
            return; // Stop further execution to prevent cycle
        }

        if (sender instanceof ComponentA) {
            System.out.println("Mediator reacts to ComponentA and triggers ComponentB.");
            componentB.executeB();
        } else if (sender instanceof ComponentB) {
            System.out.println("Mediator reacts to ComponentB and triggers ComponentC.");
            componentC.executeC();
        } else if (sender instanceof ComponentC) {
            System.out.println("Mediator reacts to ComponentC and triggers ComponentA.");
            // Here we break the cycle by setting the flag
            isCycleBroken = true;
            componentA.executeA();
        }
    }
}


