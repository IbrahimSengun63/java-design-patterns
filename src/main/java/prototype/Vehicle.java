package prototype;

public abstract class Vehicle {
    private String model;

    // Protected constructor for copying existing vehicles
    protected Vehicle(Vehicle vehicle) {
        if (vehicle != null) {
            this.model = vehicle.model;
        }
    }

    // Abstract clone method to be implemented by subclasses
    public abstract Vehicle clone();

    // Getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
