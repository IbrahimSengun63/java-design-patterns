package command;

public class Main {
    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom();
        FloorLamp floorLamp = livingRoom.getFloorLamp();

        // Create a command to switch the lights
        Command switchLights = new SwitchLightsCommand(floorLamp);

        // Set the command in the room (Invoker)
        livingRoom.setCommand(switchLights);

        // Execute the command
        livingRoom.executeCommand(); // The light is now ON
        livingRoom.executeCommand(); // The light is now OFF
    }
}
