package day_04;

import java.io.*;

public class test_serializable {

    //格式化代码快捷键  command+option+L
    //错误提示control+enter
    //序列化学生对象
    public static void serializable() {

        Student stu = new Student();
        stu.setName("hehao");
        stu.setAge(18);
        ObjectOutputStream outputStream = null;
        try {
            System.out.println("----------开始序列化，数据写入开始--------------");
            outputStream = new ObjectOutputStream(new FileOutputStream("/Users/hehao/project_resources/test.txt"));
            outputStream.writeObject(stu);
            System.out.println("----------结束序列化，数据写入成功--------------");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    //反序列化student对象  从文件中反序列化出对象
    public static Student deserializable() {
        ObjectInputStream in = null;
        Student student = null;
        try {
            System.out.println("-------开始反序列化，数据读取开始--------");
            in = new ObjectInputStream(new FileInputStream("/Users/hehao/project_resources/test.txt"));
            try {
                student = (Student) in.readObject();
                System.out.println("-------反序列化结束，数据读取成功----------");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return student;
    }

   /* public static void main(String[] args) {
        //序列化
        serializable();
        //反序列化
        Student stu = deserializable();
        System.out.println("name:"+stu.getName());
        System.out.println("age:"+stu.getAge());
    }
 */

}
