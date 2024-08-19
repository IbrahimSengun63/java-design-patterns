package command;

public class Room {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command set");
        }
    }
}