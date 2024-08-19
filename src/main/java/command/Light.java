package command;

public class Light {
    private boolean switchedOn = false;

    public void switchLights() {
        this.switchedOn = !switchedOn;
        System.out.println("The light is now " + (switchedOn ? "ON" : "OFF"));
    }
}
