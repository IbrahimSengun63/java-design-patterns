package decorator;

public class Main {
    public static void main(String[] args) {
        // Create a simple text component
        TextComponent text = new SimpleText("I am a test sentence with teh error.");

        // Decorate with spell checker
        TextComponent spellCheckedText = new SpellCheckerDecorator(text);

        // Further decorate with grammar checker
        TextComponent checkedText = new GrammarCheckerDecorator(spellCheckedText);

        // Print the final content
        System.out.println(checkedText.getContent());
    }
}
