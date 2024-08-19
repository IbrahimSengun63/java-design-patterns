package visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Element> items = new ArrayList<>();
        items.add(new Book("Design Patterns", 45.0));
        items.add(new DVD("The Matrix", 20.0));

        PriceVisitor priceVisitor = new PriceVisitor();
        TitleVisitor titleVisitor = new TitleVisitor();

        System.out.println("Applying PriceVisitor:");
        for (Element item : items) {
            item.accept(priceVisitor);
        }
        System.out.println("Total Price: " + priceVisitor.getTotalPrice());

        System.out.println("\nApplying TitleVisitor:");
        for (Element item : items) {
            item.accept(titleVisitor);
        }
    }
}
