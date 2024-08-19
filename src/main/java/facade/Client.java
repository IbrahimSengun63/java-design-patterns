package facade;

public class Client {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory memory = new Memory();

        ComputerFacade computer = new ComputerFacade(cpu, memory);

        computer.startComputer();
    }
}
