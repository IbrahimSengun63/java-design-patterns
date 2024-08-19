package decorator;

// Concrete Component
public class SimpleText implements TextComponent {
    private String content;

    public SimpleText(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
