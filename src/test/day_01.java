package test;

public class day_01 {

    public static  void testchuanzhi(StringBuffer ssl,int n){

        ssl.append("word");
        n=8;
    }

   //java中永远不会传递对象，只会传递对象的引用
    //java中的按引用传值其实还是值传递，只不过传递的是地址的值
   /* public static void main(String[] args) {

         int i =1;
         StringBuffer sl = new StringBuffer("hello");
         testchuanzhi(sl,i);
        System.out.println(sl);
        System.out.println(i);
    }*/
}
