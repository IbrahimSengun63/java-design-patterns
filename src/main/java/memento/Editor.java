package memento;

import java.util.Deque;
import java.util.LinkedList;

public class Editor {
    private Deque<TextArea.Memento> stateHistory;
    private TextArea textArea;

    public Editor() {
        stateHistory = new LinkedList<>();
        textArea = new TextArea();
    }

    public void write(String text) {
        textArea.setText(text);
        stateHistory.add(textArea.takeSnapshot());
    }

    public void undo() {
        textArea.restore(stateHistory.pop());
    }
}
