import java.util.LinkedList;

class HashTable {
    private class Entry {
        int key;
        String value;

        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] table;
    private int capacity;

    @SuppressWarnings("unchecked")
    public HashTable(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % capacity;
    }

    public void insert(int key, String value) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry(key, value));
    }

    public void delete(int key) {
        int index = hash(key);
        table[index].removeIf(entry -> entry.key == key);
    }

    public String lookup(int key) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return null;
    }

    public void display() {
        for (int i = 0; i < capacity; i++) {
            System.out.print("Bucket " + i + ":");
            for (Entry entry : table[i]) {
                System.out.print(" -> [" + entry.key + ", " + entry.value + "]");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(5);

        hashTable.insert(1, "One");
        hashTable.insert(2, "Two");
        hashTable.insert(3, "Three");
        hashTable.insert(4, "Four");
        hashTable.insert(5, "Five");
        hashTable.insert(6, "Six");
        hashTable.insert(7, "Seven");
        hashTable.insert(8, "Eight");
        hashTable.insert(9, "Nine");
        hashTable.insert(10, "Ten");

        System.out.println("State of the hash table before deletion:");
        hashTable.display();

        hashTable.delete(6);

        System.out.println("State of the hash table after deletion:");
        hashTable.display();

        System.out.println("Lookup key 6: " + hashTable.lookup(6));
    }
}
