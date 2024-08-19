package visitor;

public class PriceVisitor implements Visitor {
    private double totalPrice = 0.0;

    @Override
    public void visit(Book book) {
        totalPrice += book.getPrice();
        System.out.println("Book: " + book.getTitle() + " - Price: " + book.getPrice());
    }

    @Override
    public void visit(DVD dvd) {
        totalPrice += dvd.getPrice();
        System.out.println("DVD: " + dvd.getTitle() + " - Price: " + dvd.getPrice());
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
