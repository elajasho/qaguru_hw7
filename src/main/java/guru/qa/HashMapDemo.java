package guru.qa;

import java.util.HashMap;

public class HashMapDemo {
    private final HashMap<Integer, String> hashMap;

    public HashMapDemo() {
        hashMap = new HashMap<>();
    }

    public void addElement(int key, String value) {
        hashMap.put(key, value);
    }

    public boolean searchElement(int key) {
        return hashMap.containsKey(key);
    }

    public void removeElement(int key) {
        hashMap.remove(key);
    }

    public HashMap<Integer, String> getHashMap() {
        return hashMap;
    }
}


