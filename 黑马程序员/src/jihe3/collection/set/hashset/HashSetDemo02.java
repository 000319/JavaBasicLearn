package jihe3.collection.set.hashset;

import java.util.HashSet;

/*需求。
创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台谊历该集合要求，
学生对象的成员变量值相同，我们就认为是同一个对象
思路:
1:定义学生类
2:创建HashSet集合对象3:创建学生对象
3:把学生添加到集合
4:遍历集合（增强for)
*/
public class HashSetDemo02 {
    public static void main(String[] args) {
      //创建集合对象
        HashSet<HashSetDemo02Student> set = new HashSet<HashSetDemo02Student>();
        //添加元素对象
        HashSetDemo02Student s1 = new HashSetDemo02Student("张三",20);
        HashSetDemo02Student s2 = new HashSetDemo02Student("李四",20);
        HashSetDemo02Student s3 = new HashSetDemo02Student("王五",20);
        HashSetDemo02Student s4 = new HashSetDemo02Student("王五",20);
        //添加集合元素
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        //输出元素
        for (HashSetDemo02Student outcome:set){
            System.out.println(outcome.getName()+","+outcome.getAge()+","+"哈希值:"+outcome.hashCode());
        }
   }
}
