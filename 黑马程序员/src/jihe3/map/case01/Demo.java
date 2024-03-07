package jihe3.map.case01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*需求:
创建一个HashMap集合，健是学号(String)，值是学生对象(Student)。存储三个键值对元素，并遍历
思路:
1:定义学生类
2:创建HashMop集合对象
3:创建学生对象
4:把学生添加到集合
5:遍历集合
方式1:键找值
方式2:锭值对对象找健和值
*/
public class Demo {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String,Student> map = new HashMap<>();
        //创建学生对象
        Student s1= new Student("硫化",20);
        Student s2= new Student("张化",26);
        Student s3= new Student("李化",70);
        //添加集合元素
        map.put("999",s1);
        map.put("998",s2);
        map.put("997",s3);
        //遍历元素方法一
        Set<String> set = map.keySet();
        for (String key: set){
            Student value = map.get(key);
            System.out.println(key+","+value.getName()+","+value.getAge());
        }
        System.out.println("----------");

        //方法二
        Set<Map.Entry<String,Student>> entrySet = map.entrySet();
        for (Map.Entry<String,Student> outcome:entrySet ){
            String key = outcome.getKey();
            Student value = outcome.getValue();
            System.out.println(key+","+value.getName()+","+value.getAge());
        }
    }
}
