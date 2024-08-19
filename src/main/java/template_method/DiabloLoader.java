package template_method;

public class DiabloLoader extends BaseGameLoader{
    @Override
    protected void initialize() {
        System.out.println("Initializing Diablo...");
    }

    @Override
    protected void loadAssets() {
        System.out.println("Loading Diablo assets...");
    }

    // Optionally overriding the hook method
    @Override
    protected void startGame() {
        System.out.println("Diablo is ready. Enjoy your game!");
    }
}
