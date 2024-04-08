package opgave01.models;

import java.util.Iterator;

public class LinkedList<E> implements ListEaaa<E> {
    Node<E> head = null;
    Node<E> tail = null;
    @Override
    public void add(E e) {
        Node node = new Node<E>(e);
        if(tail == null) {
           tail = node;
           head = node;
        }
        else {
            tail.setNext(node);
            tail = node;
        }
    }

    @Override
    public boolean remove(E e) {
        boolean removed = false;
        Node<E> node = head;
        Node<E> prevNode = head;

        while(node.getElement() != null && !removed) {
            if(node.getElement().equals(e)) {
                prevNode.setNext(node.getNext());
                removed = true;
            }
            else {
                prevNode = node;
                node = node.getNext();
            }
        }
        return removed;
    }

    @Override
    public void addFirst(E e) {

    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public void removeFirst() {

    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
    // Remember obstruction
    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void add(int index, E e) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(E e) {
        return 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
