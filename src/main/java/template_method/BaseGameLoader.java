package template_method;

public abstract class BaseGameLoader {
    // Template method
    public final void loadGame() {
        initialize();
        loadAssets();
        startGame();
    }

    // Steps of the algorithm
    protected abstract void initialize();
    protected abstract void loadAssets();

    // Hook method, which can have a default implementation
    protected void startGame() {
        System.out.println("Game is starting...");
    }
}
