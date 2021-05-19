import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 8;
    private E[] elements;

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = (E[]) new Object[capacity];
        this.size = capacity;
    }

    private void ensureCapa() {
        if (size > elements.length) {
            E[] newArray = (E[]) (new Object[size*2+1]);
            for (int i = 0;i< elements.length;i++){
                newArray[i] = elements[i];
            }
            elements = newArray;
        }
    }

    public void add(E e) {
        size += 1;
        ensureCapa();
        elements[size - 1] = e;
    }

    public boolean add(E e, int index) {
        if (index >= 0 && index <= size) {
            size ++;
            ensureCapa();
            for (int i = size - 2; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = e;
            return true;
        }
        return false;
    }

    public E get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        }
        return null;
    }

    public E[] getElements() {
        return this.elements;
    }

    public int size() {
        return size;
    }

    public E remove(int index) {
        E result = null;
        if (index >= 0 && index < size) {
            result = elements[index];
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size --;
        }
        return result;
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(E e) {
        for (E x : elements) {
            if (e.equals(x)) {
                return true;
            }
        }
        return false;
    }
}
