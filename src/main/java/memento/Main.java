package memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("213123");
        editor.write("asdasdasd");
        editor.undo();
    }
}
