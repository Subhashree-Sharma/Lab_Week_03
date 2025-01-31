package HashMaps.ImplementCustomHashMap;

import java.util.LinkedList;
//entry class
class Entry<K, V> {
    K key;
    V value;

    //constructor
    Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
//custom hashmap class
class CustomHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] buckets;

    //constructor
    public CustomHashMap() {
        buckets = new LinkedList[INITIAL_CAPACITY];
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    //getBucket index
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % INITIAL_CAPACITY);
    }

    //method to put key and value
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry<>(key, value));
    }

    //get method
    public V get(K key) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    //method to remove
    public void remove(K key) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        bucket.removeIf(entry -> entry.key.equals(key));
    }
}
