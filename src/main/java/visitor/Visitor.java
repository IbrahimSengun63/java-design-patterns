package visitor;

// Visitor Interface
public interface Visitor {
    void visit(Book book);
    void visit(DVD dvd);
}