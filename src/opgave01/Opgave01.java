package opgave01;

import opgave01.models.LinkedList;

public class Opgave01 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.remove("World");
    }
}
