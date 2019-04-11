package test;
import java.util.*;
public class ArraysSort {
        public static class Node {
            public int min;
            public int sum;
            public int index;
            Node(int a, int b, int c) {min = a; sum = b; index = c;}
        }
       /* public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            scanner.nextLine();
            Node[] nodes = new Node[num];
            for (int i = 0; i < num; i++) {
                String str = scanner.nextLine();
                String[] strs = str.split(" ");
                int min = Integer.MAX_VALUE;
                int sum = 0;
                for (int j = 0; j < 5; j++) {
                    int data = Integer.parseInt(strs[j]);
                    if (data < min)
                        min = data;
                    sum += data;
                }
                nodes[i] = new Node(min, sum, i);
            }
            Arrays.sort(nodes, new Comparator<Node>() {
                @Override
                //排序的方法 ，升序是前者减去后者，降序是后者减去前者。
                public int compare(Node node1, Node node2) {
                    if(node1.min==node2.min){
                      if(node1.sum==node2.sum){
                          return node2.sum-node1.sum;
                      }
                      else {
                         return node1.index-node2.index;
                      }

                    }
                    else {
                        return node2.min-node1.min;
                    }
                }
            });
            for (int i = 0; i < num; i++)
                System.out.print(nodes[i].index + " ");
        }*/

}
