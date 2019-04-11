package hashmap;

public class hashmap_test {

    public static void main(String[] args) {

        MyHashMap map = new MyHashMap();
        for(int i=0;i<1000;i++){

            map.put("何浩"+i,"何先生"+i);
            System.out.println(map.get("何浩"+i));
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(map);
    }
}
