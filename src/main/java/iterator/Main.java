package iterator;

public class Main {
    public static void main(String[] args) {
        ConcreteCollection collection = new ConcreteCollection(5);
        collection.addItem("Item 1");
        collection.addItem("Item 2");
        collection.addItem("Item 3");
        collection.addItem("Item 4");

        Iterator iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
