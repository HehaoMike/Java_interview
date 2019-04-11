package hashmap;

public class MyHashMap<K,V> implements Map<K,V>{

    private Entry<K,V> table =null;
    private static int defalutLenth =16;
    private int size = 0;
    private  int age;
    @Override
    public V put(K k, V v) {
        return null;
    }

    @Override
    public V get(K k) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    class Entry<K,V> implements Map.Entry<K,V>{


        @Override
        public V getKey() {
            return null;
        }

        @Override
        public V getValue() {
            return null;
        }
    }


}
