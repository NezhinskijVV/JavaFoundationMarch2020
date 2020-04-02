package listPractice;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList {
    private Object[] array;
    private int realSize;

    public final static int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }


    public Object[] toArray() {
        return new Object[0];
    }


    public boolean add(Object o) {
        if (realSize == array.length) {
            array = Arrays.copyOf(array,
                    3 * array.length / 2 + 1);
        }
        array[realSize] = o;
        realSize++;
        return true;
    }


    public boolean remove(Object o) {
        return false;
    }


    public boolean addAll(Collection c) {
        return false;
    }


    public void clear() {

    }


    public Object get(int index) {
        indexOutOfRange(index);
        return array[index];
    }


    public Object set(int index, Object element) {
        return null;
    }


    public void add(int index, Object element) {

    }


    public Object remove(int index) {
        indexOutOfRange(index);
        Object removeElem = array[index];
        for (int i = index; i < realSize - 1; i++) {
            array[i] = array[i + 1];
        }
        array[realSize - 1] = null;
        realSize--;
        return removeElem;
    }

    private void indexOutOfRange(int index) {
        if (index >= realSize || index < 0) {
            throw new RuntimeException("Ouf Of bound array real size");
        }
    }

    public int indexOf(Object o) {
        return 0;
    }


    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", realSize=" + realSize +
                '}';
    }
}