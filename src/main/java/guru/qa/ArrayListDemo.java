package guru.qa;

import java.util.ArrayList;

public class ArrayListDemo {
    private final ArrayList<String> arrayList;

    public ArrayListDemo() {
                arrayList = new ArrayList<>();
    }

    public void addElement(String element) {
        arrayList.add(element);
    }

    public boolean searchElement(String element) {
        return arrayList.contains(element);
    }

    public void removeElement(String element) {
        arrayList.remove(element);
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }
}