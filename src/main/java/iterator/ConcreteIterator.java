package iterator;

public class ConcreteIterator implements Iterator {
    private ConcreteCollection collection;
    private int index = 0;

    public ConcreteIterator(ConcreteCollection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.getSize();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return collection.getItems()[index++];
        }
        return null;
    }
}
