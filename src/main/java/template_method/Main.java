package template_method;

public class Main {
    public static void main(String[] args) {
        BaseGameLoader wowLoader = new WorldOfWarcraftLoader();
        BaseGameLoader diabloLoader = new DiabloLoader();

        // Load World of Warcraft
        wowLoader.loadGame();

        // Load Diablo
        diabloLoader.loadGame();
    }
}
