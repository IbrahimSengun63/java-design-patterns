package iterator;

public class ConcreteCollection implements IterableCollection {
    private Object[] items;
    private int size = 0;

    public ConcreteCollection(int capacity) {
        items = new Object[capacity];
    }

    public void addItem(Object item) {
        if (size < items.length) {
            items[size++] = item;
        }
    }

    public Object[] getItems() {
        return items;
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
