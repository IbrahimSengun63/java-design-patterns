package visitor;

// Concrete Visitor - TitleVisitor
public class TitleVisitor implements Visitor {

    @Override
    public void visit(Book book) {
        System.out.println("Book Title: " + book.getTitle());
    }

    @Override
    public void visit(DVD dvd) {
        System.out.println("DVD Title: " + dvd.getTitle());
    }
}