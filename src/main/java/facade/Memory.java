package facade;

// Subsystem Class 2
public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Memory loading data at position " + position);
    }

    public void loadData(byte[] data) {
        System.out.println("Memory loading data");
    }
}