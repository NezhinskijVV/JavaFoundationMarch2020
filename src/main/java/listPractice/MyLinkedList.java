package listPractice;

import java.util.Collection;

public class MyLinkedList<E> {
    private MyNode<E> head = null;

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

    public boolean add(E e) {
        MyNode<E> node = new MyNode<>(e, null);
        if (head == null) {
            head = node;
        } else {
            MyNode curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(node);
        }
        return true;
    }


    public boolean remove(Object o) {
        return false;
    }


    public void clear() {

    }


    public Object get(int index) {
        return null;
    }


    public Object set(int index, Object element) {
        return null;
    }


    public void add(int index, E element) {

    }

    public E remove(int index) {
        MyNode<E> removingNode = null;
        if (head != null) {
            MyNode curNode = head;
            if (index == 0) {
                head = curNode.getNext();
                return head != null ? head.getValue() : null;
            } else {
                for (int i = 0; i < index - 1; i++) {
                    curNode = curNode.getNext();
                }
                removingNode = curNode.getNext();
                if (removingNode.getNext() != null) {
                    curNode.setNext(removingNode.getNext());
                } else {
                    curNode.setNext(null);
                }
                removingNode.setNext(null);
            }
        }
        return (E) removingNode.getValue();
    }


    public int indexOf(E o) {
        return 0;
    }


    public int lastIndexOf(Object o) {
        return 0;
    }


    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (head != null) {
            MyNode<E> curNode = head;
            while (curNode.getNext() != null) {
                stringBuilder.append(curNode.getValue()).append(" ");
                curNode = curNode.getNext();
            }
            stringBuilder.append(curNode.getValue());
        }
        return stringBuilder.toString();
    }
}
