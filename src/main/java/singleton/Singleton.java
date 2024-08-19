package singleton;

public class Singleton {
    // The single instance of the class, marked as volatile to ensure visibility across threads
    private static volatile Singleton instance;

    // Instance-specific data
    private String data;

    // Private constructor to prevent external instantiation
    private Singleton(String data) {
        this.data = data;
    }

    // Static method to get the single instance, with lazy initialization
    public static Singleton getInstance(String data) {
        Singleton result = instance; // First check (without synchronization) to improve performance
        if (result == null) { // If instance is null, proceed to synchronize
            synchronized (Singleton.class) { // Synchronize on the class to ensure only one thread can create the instance
                result = instance; // Check again within the synchronized block
                if (result == null) { // If still null, create the instance
                    instance = result = new Singleton(data); // Create the Singleton instance
                }
            }
        }
        return result; // Return the single instance
    }

    // Public method to access the instance-specific data
    public String getData() {
        return data;
    }
}

