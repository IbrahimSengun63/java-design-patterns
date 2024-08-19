package prototype;

public class Car extends Vehicle {
    private int topSpeed;
    private GpsSystem gpsSystem;

    // Copy constructor
    public Car(Car car) {
        super(car);
        if (car != null) {
            this.topSpeed = car.topSpeed;
            this.gpsSystem = (car.gpsSystem != null) ? car.gpsSystem.clone() : null;
        }
    }

    // Implementation of the clone method
    @Override
    public Car clone() {
        return new Car(this);
    }

    // Getters and setters
    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public GpsSystem getGpsSystem() {
        return gpsSystem;
    }

    public void setGpsSystem(GpsSystem gpsSystem) {
        this.gpsSystem = gpsSystem;
    }
}
