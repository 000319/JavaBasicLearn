package jihe3.map.case02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*需求;
创建一个HashMap集合，键是学生对象(Student)，值是居住地(String)。存储多个键值对元素，并遍历。
要求保证馋的唯一性。如果学生对象的成员变量值相同，我们就认为是同一个对象
思路：
1 :定义学生类
2:创建HashMap集合对象
3:创建学生对象
4;把学生添加到集合
5:遍历集合
6:在学生类中重写两个方法
hashCode( )
equals()
*/
public class Demo {
    public static void main(String[] args) {
        //创建集合对象
       HashMap<Student,String> map = new HashMap<>();
        //创建学生对象
        Student s1= new Student("硫化",20);
        Student s2= new Student("张化",26);
        Student s3= new Student("李化",70);
        //添加集合元素
        map.put(s1,"999");
        map.put(s2,"999");
        map.put(s3,"999");
        //遍历元素方法一
        Set<Student> set = map.keySet();
        for (Student outcome:set){
            String value = map.get(outcome);
            System.out.println(outcome.getName()+","+outcome.getAge()+","+value);
        }
        System.out.println("---------");
        //方法二
        Set<Map.Entry<Student,String>> entrySet = map.entrySet();
        for (Map.Entry<Student,String> outcome:entrySet){
            Student key = outcome.getKey();
            String value = outcome.getValue();
            System.out.println(key.getName()+","+key.getAge()+","+value);

        }
    }
}
