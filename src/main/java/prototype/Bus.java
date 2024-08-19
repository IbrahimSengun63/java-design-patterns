package prototype;

public class Bus extends Vehicle {
    private int doors;

    // Copy constructor
    public Bus(Bus bus) {
        super(bus);
        if (bus != null) {
            this.doors = bus.doors;
        }
    }

    // Implementation of the clone method
    @Override
    public Bus clone() {
        return new Bus(this);
    }

    // Getters and setters
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
