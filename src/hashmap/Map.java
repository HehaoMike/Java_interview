package hashmap;

/**
 * 定义的接口
 * @param <K>
 * @param <V>
 */
public interface Map<K,V>{

  public V put(K k,V v);
  public V get(K k);
  public  int size();

  public  interface  Entry<K,V>{

      public V getKey();
      public V getValue();
  }

}
