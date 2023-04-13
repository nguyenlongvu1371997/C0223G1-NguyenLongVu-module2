package ss10_array_list.excercise.array_list;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = (E[]) new Object[capacity];
    }

    public void checkSize(int size) {
        if (size > elements.length) {
            int bigSize = size * 2;
            elements = Arrays.copyOf(elements, bigSize);
        }
    }

    public Boolean add(int index, E element) {
        if (index <= size && index >= 0) {
            size++;
            checkSize(size);
            for (int i = size; i > index + 1; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            return true;
        }
        return false;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("index: " + i + ", Size" + i);
        }
        return (E) elements[i];
    }

    public Object remove(int index) {
        E remove = (E) elements[index];
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size -= 1;
            return remove;
        }
        return (E) elements[index];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
