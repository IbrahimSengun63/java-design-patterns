package proxy;

public class RealService implements Service {
    @Override
    public void performOperation() {
        System.out.println("Performing operation in RealService.");
    }
}
