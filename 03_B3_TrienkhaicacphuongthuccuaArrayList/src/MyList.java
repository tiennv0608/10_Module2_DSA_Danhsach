import java.util.Iterator;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
    }

    public MyList(int capacity) {
        elements = new Object[DEFAULT_CAPACITY];
        this.size = capacity;
    }

    public void add(int index, E e) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = e;
        this.size++;
    }

    private void ensureCapacity() {
        if (size >= elements.length) {
            E[] newElements = (E[]) (new Object[this.size * 2 + 1]);
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = (E) (elements[i]);
            }
            elements = newElements;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        }
    }

    public E remove(int index) {
        checkIndex(index);
        E element = (E) elements[index];
        for (int i = index; i < this.size - 1; i++) {
            elements[index] = elements[index + 1];
        }
        this.size--;
        return element;
    }

    public int size() {
        return this.size;
    }

    @Override
    public E clone() {
        return (E) elements;
    }

    public boolean contains(E o) {
        for (int i = 0; i < this.size; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < this.size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        ensureCapacity();
        elements[size()] = e;
        return true;
    }


}
