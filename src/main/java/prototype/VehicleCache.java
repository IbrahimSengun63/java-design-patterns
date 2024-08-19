package prototype;

import java.util.HashMap;
import java.util.Map;

public class VehicleCache {
    private Map<String, Vehicle> cache = new HashMap<>();

    public VehicleCache() {
        // You can initialize the cache with some prototypes
        cache.put("basicCar", new Car(null));
        cache.put("basicBus", new Bus(null));
    }

    public void registerVehicle(String key, Vehicle vehicle) {
        cache.put(key, vehicle);
    }

    public Vehicle getVehicle(String key) {
        Vehicle cachedVehicle = cache.get(key);
        return (cachedVehicle != null) ? cachedVehicle.clone() : null;
    }
}
