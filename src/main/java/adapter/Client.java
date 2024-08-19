package adapter;

// Client using the Adapter
public class Client {
    private final ClientInterface clientInterface;

    public Client(ClientInterface clientInterface) {
        this.clientInterface = clientInterface;
    }

    public void displayData() {
        System.out.println(clientInterface.getClientData());
    }

    public static void main(String[] args) {
        Service service = new Service();
        ClientInterface adapter = new Adapter(service);
        Client client = new Client(adapter);

        client.displayData();  // Output: "Data from Service"
    }
}
