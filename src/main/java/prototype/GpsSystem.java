package prototype;

public class GpsSystem {
    // Example fields
    private String version;

    public GpsSystem(String version) {
        this.version = version;
    }

    // Copy constructor
    public GpsSystem(GpsSystem gpsSystem) {
        if (gpsSystem != null) {
            this.version = gpsSystem.version;
        }
    }

    // Implementation of the clone method
    @Override
    public GpsSystem clone() {
        return new GpsSystem(this);
    }

    // Getters and setters
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
