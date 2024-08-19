package prototype;

public class Main {
    public static void main(String[] args) {
        VehicleCache vehicleCache = new VehicleCache();

        Car car = new Car(null);
        car.setModel("Model S");
        car.setTopSpeed(250);
        car.setGpsSystem(new GpsSystem("v1.0"));

        Bus bus = new Bus(null);
        bus.setModel("City Bus");
        bus.setDoors(4);

        vehicleCache.registerVehicle("fastCar", car);
        vehicleCache.registerVehicle("cityBus", bus);

        // Retrieve and clone the vehicles
        Car clonedCar = (Car) vehicleCache.getVehicle("fastCar");
        Bus clonedBus = (Bus) vehicleCache.getVehicle("cityBus");

        System.out.println("Cloned Car Model: " + clonedCar.getModel());
        System.out.println("Cloned Bus Doors: " + clonedBus.getDoors());
    }
}
