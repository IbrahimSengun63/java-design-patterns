package decorator;

// Concrete Decorator for Grammar Checking
public class GrammarCheckerDecorator extends TextDecorator {
    public GrammarCheckerDecorator(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String getContent() {
        return addGrammarCheck(super.getContent());
    }

    private String addGrammarCheck(String content) {
        // Simple grammar-checking logic (for demonstration)
        return content.replace("I am", "I am not");
    }
}