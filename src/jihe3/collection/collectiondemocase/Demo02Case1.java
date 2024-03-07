package jihe3.collection.collectiondemocase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*案例:List集合存储学生对象并遍历
需求:创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
思路:
定义学生类
创建List集合对象
③创建学生对象
④把学生添加到集合
遍历集合(迭代器方式，for循环方式)
*/
public class Demo02Case1 {
    public static void main(String[] args) {
     //创建集合对象
        List<Student> list = new ArrayList<Student>();
        //创建学生对象
        Student s1 = new Student("李华",20);
        Student s2 = new Student("王江强",20);
        Student s3 = new Student("赵磊",20);
        //添加集合元素
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //方式一：使用迭代器输出元素
        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
           Student outcome = it.next();
            System.out.println(outcome.getName()+","+outcome.getAge());
        }
       //方式二：使用普通for循环方式输出元素
        for (int i =0;i<list.size();i++){
            Student outcome = list.get(i);
            System.out.println(outcome.getName()+","+outcome.getAge());
        }
        //方式三：使用增强for循环方式输出元素
        for (Student i:list){
            System.out.println(i.getName()+","+i.getAge());
        }
    }
}
