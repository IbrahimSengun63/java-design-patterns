package template_method;

public class WorldOfWarcraftLoader extends BaseGameLoader{
    @Override
    protected void initialize() {
        System.out.println("Initializing World of Warcraft...");
    }

    @Override
    protected void loadAssets() {
        System.out.println("Loading World of Warcraft assets...");
    }
}
