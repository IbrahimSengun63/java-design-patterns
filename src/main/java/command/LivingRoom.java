package command;

public class LivingRoom extends Room {
    private FloorLamp floorLamp;

    public LivingRoom() {
        this.floorLamp = new FloorLamp();
    }

    public FloorLamp getFloorLamp() {
        return this.floorLamp;
    }
}