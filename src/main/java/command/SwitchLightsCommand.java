package command;

public class SwitchLightsCommand implements Command {
    private FloorLamp floorLamp;

    public SwitchLightsCommand(FloorLamp floorLamp) {
        this.floorLamp = floorLamp;
    }

    @Override
    public void execute() {
        floorLamp.switchLights();
    }
}
