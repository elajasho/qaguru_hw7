package guru.qa;


import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("_____________________");

        ArrayListDemo arrayListDemo = new ArrayListDemo();
        arrayListDemo.addElement("Элемент 1");
        arrayListDemo.addElement("Элемент 2");
        System.out.println("Поиск: " + arrayListDemo.searchElement("Элемент 1"));
        arrayListDemo.removeElement("Элемент 1");
        for (String element : arrayListDemo.getArrayList()) {
            System.out.println(element);
        }

        System.out.println("_____________________");

        HashSetDemo hashSetDemo = new HashSetDemo();
        hashSetDemo.addElement("Item A");
        hashSetDemo.addElement("Item B");
        System.out.println("Поиск: " + hashSetDemo.searchElement("Item A"));
        hashSetDemo.removeElement("Item A");
        for (String element : hashSetDemo.getHashSet()) {
            System.out.println(element);
        }

        System.out.println("_____________________");

        LinkedListDemo linkedListDemo = new LinkedListDemo();
        linkedListDemo.addElement("Item X");
        linkedListDemo.addElement("Item Y");
        System.out.println("Поиск: " + linkedListDemo.searchElement("Item X"));
        linkedListDemo.removeElement("Item X");

        Iterator<String> iterator = linkedListDemo.getLinkedList().iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println("_____________________");

        HashMapDemo hashMapDemo = new HashMapDemo();
        hashMapDemo.addElement(1, "Value 1");
        hashMapDemo.addElement(2, "Value 2");
        System.out.println("Поиск: " + hashMapDemo.searchElement(1));
        hashMapDemo.removeElement(1);
        HashMap<Integer, String> hashMap = hashMapDemo.getHashMap();
        hashMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));


        System.out.println("_____________________");

        QueueDemo queueDemo = new QueueDemo();
        queueDemo.enqueue("Элемент 1");
        queueDemo.enqueue("Элемент 2");
        queueDemo.enqueue("Элемент 3");
        queueDemo.enqueue("Элемент 4");

        do {
            String element = queueDemo.dequeue();
            System.out.println("Вывод элемента: " + element);
        } while (!queueDemo.isEmpty());

        System.out.println("_____________________");

    }
}
