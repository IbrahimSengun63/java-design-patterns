package adapter;

// Adapter that makes Service compatible with ClientInterface
public class Adapter implements ClientInterface {
    private final Service service;

    public Adapter(Service service) {
        this.service = service;
    }

    @Override
    public String getClientData() {
        // Using the service to get the data and adapt it to the client interface
        return service.fetchData();
    }
}
