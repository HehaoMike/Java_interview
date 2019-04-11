package hashmap;

public class MyHashMap<K,V> implements Map<K,V>{

    private Entry<K,V>[] table =null; //Entry对象
    private static int defalutLenth =16; //定义了数组的大小
    private int size = 0;

    public  MyHashMap(){

        table = new Entry[defalutLenth];
    }
    @Override
    public V put(K k, V v) {
        //hash  出来hashcode数值
        int index = hash(k);
        //数组的长度  index的值  计算出下标的位置
        Entry entry = table[index];//通过下标获取的该位置的entry对象
        //自己的想法代码

        //如果为空直接插入
        if(entry==null){
            table[index] = new Entry<>(k, v, null, index);
            size++;
        }else{//如果这个储存位置index不为空
            //如果插入重复的值
            if(v==table[index].getValue()){
                table[index] = entry;
            }
            table[index] = new Entry<>(k, v, entry, index);
        }
        //通过这个下标的位置找到我们table对于Entry对象
        return table[index].getValue();
    }

    @Override
    public V get(K k) {
       if(size==0){
           return  null;
       }
       int index = hash(k);
       Entry<K,V> entry = getEntry(k,index);
       if(entry==null){
           return  null;
       }
       return entry.getValue();
    }
    private  Entry<K,V> getEntry(K k,int index){
        for(Entry e =table[index];e!=null;e=e.next){
            if(e.hash==index&&(k==e.getKey())|| k.equals(e.getKey())){
                return e;
            }
        }
       return  null;
    }
    @Override
    public int size() {
        return 0;
    }

    /**
     *
     * @param k 传入的参数
     * @return 返回的是 下标的位置 index
     */
    private  int hash(K k){
        int index = k.hashCode() % (defalutLenth - 1);//这个数可能为正数可能是负数
        return Math.abs(index);
    }
    class Entry<K,V> implements Map.Entry<K,V>{

        private  K k;
        private  V v;
        private Entry<K,V> next;
        private  int hash;
        public Entry(K k, V v, Entry<K, V> next, int hash) {

            this.k = k;
            this.v = v;
            this.next = next;
            this.hash = hash;
        }
        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }
    }


}
