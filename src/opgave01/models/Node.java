package opgave01.models;

public class Node<T> {
    private T element;
    private Node<T> next;

    public Node(T t) {
        element = t;
        this.next = null;
    }
    public void setNext(Node<T> n) {
        this.next = n;
    }
    public T getElement() {
        return element;
    }
    public Node<T> getNext() {
        return next;
    }

}
