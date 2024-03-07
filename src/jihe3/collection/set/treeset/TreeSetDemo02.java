package jihe3.collection.set.treeset;

import java.util.TreeSet;
/*自然排序Comparable的使用
存储学生对象并遍历，创建TreeSet集合使用无参构造方法
要求:按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
结论:
用TreeSet集合存储自定义对象，无参构造方法使用的是自然排序对元素进行排序的自然排序，
就是让元素所属的类实现Comparable接口，重写compareTo(T o)方法重写方法时，
一定要注意排序规则必须按照要求的主要条件和次要条件来写
*/
public class TreeSetDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<TreeSetDemo02Student> set = new TreeSet<TreeSetDemo02Student>();
        //创建学生对象
        TreeSetDemo02Student s1= new TreeSetDemo02Student("李华",23);
        TreeSetDemo02Student s2= new TreeSetDemo02Student("赵磊",25);
        TreeSetDemo02Student s3= new TreeSetDemo02Student("张士",24);
        TreeSetDemo02Student s4= new TreeSetDemo02Student("张强",24);
        TreeSetDemo02Student s5= new TreeSetDemo02Student("张强",24);
        //添加集合元素
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
       //遍历
        for (TreeSetDemo02Student oe:set){
            System.out.println(oe.getName()+","+oe.getAge());
        }
    }
}
