package decorator;

public class SpellCheckerDecorator extends TextDecorator {
    public SpellCheckerDecorator(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getContent() {
        return addSpellCheck(super.getContent());
    }

    private String addSpellCheck(String content) {
        // Simple spell-checking logic (for demonstration)
        return content.replace("teh", "the");
    }
}