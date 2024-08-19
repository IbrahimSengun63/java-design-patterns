package proxy;

public class ProxyService implements Service {
    private RealService realService;

    @Override
    public void performOperation() {
        if (realService == null) {
            realService = new RealService(); // Lazy initialization
        }
        // You can add additional functionality here, like logging
        System.out.println("Proxy: Delegating request to RealService.");
        realService.performOperation();
    }
}
