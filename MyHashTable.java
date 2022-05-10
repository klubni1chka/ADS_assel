public class MyHashTable <K,V> {
    private class HashNode<K, V> {
        private K key;
        private V value;
        private HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key + "" + value + "}";
        }
    }

    private HashNode<K, V>[] chainArray;
    private int M = 11;
    private int size;

    public MyHashTable() {
        this(11);
    }

    public int size() {
        return size;
    }

    public MyHashTable(int M) {
        this.M = size;
        chainArray = new HashNode[M];
        this.size = 0;
    }

    public int hash(K key) {
        return key.toString().length() % chainArray.length;
    }

    public void put(K key, V value) {
        if (key.equals(null)|| value.equals(null) ) {
            System.out.println("you have a mistakes");
        }
        int hashedKey = hash(key);
        HashNode head = chainArray[hashedKey];
        while (!head.equals(null)) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = chainArray[hashedKey];
        HashNode employee = new HashNode(key, value);
        employee.next = head;
        chainArray[hashedKey] = employee;
    }

    public V get(K key) {
        if (key.equals(null)) {
            throw new IllegalArgumentException("Ur key is null");
        }
        int hashedKey = hash(key);
        HashNode head = chainArray[hashedKey];
        while (!head.equals(null)) {
            if (head.key.equals(key)) {
                System.out.println(head.value);
            }
            head = head.next;
        }
        return null;
    }

    public V remove(K key) {
        int HashedKey = hash(key);
        HashNode head = chainArray[HashedKey];
        HashNode previous = null;
        while (!head.equals(null)) {
            if (head.key.equals(key)) {
                break;
            }
            previous = head;
            head = head.next;
        }
        if (head.equals(null)) {
            return null;
        }
        size--;
        if (!previous.equals(null)) {
            previous.next = head.next;
        } else {
            chainArray[HashedKey] = head.next;
        }
        return (V) head.value;
    }

    public boolean contains(V value) {
        return contains(value);
    }

    public K getKey(V value) {
        if (value.equals(null)) {
            throw new IllegalArgumentException("Ur value is null");
        }
        int hashedValue = hash((K) value);
        HashNode head = chainArray[hashedValue];
        while (!head.equals(null)) {
            if (head.value.equals(value)) {
                System.out.println(head.key);
            }
            head = head.next;
        }

        return null;
    }


    public static void main(String[] args) {
        MyHashTable kkk = new MyHashTable(11);
        kkk.put(11, "assel");
        kkk.put(12, "amina");
        kkk.put(13, "arina");
        System.out.println(kkk.get(12));


    }
}