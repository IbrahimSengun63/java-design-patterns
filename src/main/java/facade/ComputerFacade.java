package facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;

    public ComputerFacade(CPU cpu, Memory memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    public void startComputer() {
        System.out.println("Starting computer...");
        cpu.freeze();
        memory.load(0, new byte[1024]); // Example data
        cpu.jumpTo(0);
        cpu.execute();
    }
}