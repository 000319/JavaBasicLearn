package jihe3.collections.csae;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*案例:ArrayList存储学生对象并排序
需求: ArrayList存储学生对象，使用Collections对ArrayList进行排序
要求:按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序思路:
1、定义学生类
2、创建ArrayList集合对象
3、创建学生对象
4、把学生添加到集合
5、使用Collections对ArrayList集合排序
*/
public class Demo {
    public static void main(String[] args) {
        //创建Collection集合对象
        ArrayList<Student> arrayList = new ArrayList<>();
        //创建学生对象
        Student s1 = new Student("LiHua", 50);
        Student s2 = new Student("WangHua", 20);
        Student s3 = new Student("ZhangHua", 20);
        //添加元素
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        //排序规则设置
        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        for (Student i : arrayList) {
            System.out.println(i.getName() + "," + i.getAge());
        }
    }
}
