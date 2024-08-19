package abstract_factory;

public class Main {
    public static void main(String[] args) {
        ComputerFactory msi = new MsiManufacturer();
        Gpu msiGpu = msi.createGpu();;
        Monitor msiMonitor = msi.createMonitor();
        msiGpu.assemble();
        msiMonitor.assemble();

        ComputerFactory asus = new AsusManufacturer();
        Gpu asusGpu = asus.createGpu();
        Monitor asusMonitor = asus.createMonitor();
        asusGpu.assemble();
        asusMonitor.assemble();
    }
}
