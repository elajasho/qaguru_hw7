package guru.qa;

import java.util.HashSet;

public class HashSetDemo {
    private final HashSet<String> hashSet;

    public HashSetDemo() {
        hashSet = new HashSet<>();
    }

    public void addElement(String element) {
        hashSet.add(element);
    }

    public boolean searchElement(String element) {
        return hashSet.contains(element);
    }

    public void removeElement(String element) {
        hashSet.remove(element);
    }

    public HashSet<String> getHashSet() {
        return hashSet;
    }
}