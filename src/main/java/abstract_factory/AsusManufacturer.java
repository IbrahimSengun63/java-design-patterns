package abstract_factory;

public class AsusManufacturer extends ComputerFactory{
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
