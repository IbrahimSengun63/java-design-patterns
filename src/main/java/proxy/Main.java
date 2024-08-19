package proxy;

public class Main {
    public static void main(String[] args) {
        Service service = new ProxyService();
        service.performOperation(); // Proxy controls access to RealService
    }
}
