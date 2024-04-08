package opgave01.models;

public class Node<T> {
    public Node(T t) {
        element = t;
        this.next = null;
    }
    T element;
    Node<T> next;
    public void setNext(Node<T> n) {
        this.next = n;
    }
}
