package guru.qa;

import java.util.LinkedList;

public class LinkedListDemo {
    private final LinkedList<String> linkedList;

    public LinkedListDemo() {
        linkedList = new LinkedList<>();
    }

    public void addElement(String element) {
        linkedList.add(element);
    }

    public boolean searchElement(String element) {
        return linkedList.contains(element);
    }

    public void removeElement(String element) {
        linkedList.remove(element);
    }

    public LinkedList<String> getLinkedList() {
        return linkedList;
    }
}
