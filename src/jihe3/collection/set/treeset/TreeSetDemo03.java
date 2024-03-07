package jihe3.collection.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

//含参比较器--含参构造方法
/*需求:
用TreeSet集合存储多个学生信息.(姓名，语文成绩，数学成绩)，并遍历该集合要求:按照总分从高到低出现
思路:
1：定义学生类
2:创建Treeset集合对象,通过比较器排序进行排序
3:创建学生对象
4:把学生对象添加到集合5:遍历集合
*/
public class TreeSetDemo03 {
    public static void main(String[] args) {

        //创建含集合对象的含参比较器
        TreeSet<TreeSetDemo03Student> set = new TreeSet<TreeSetDemo03Student>(new Comparator<TreeSetDemo03Student>() {
            @Override
            public int compare(TreeSetDemo03Student s1, TreeSetDemo03Student s2) {
                //主要条件
                int num =s2.getsum()-s1.getsum();
                //次要条件
                int num2 = (num==0?s2.getchinese()-s1.getchinese():num);
                int num3 = (num2==0?s2.getName().compareTo(s1.getName()):num2);
                return num3;
            }
        });
        //添加学生对象
        TreeSetDemo03Student s1=new TreeSetDemo03Student("李强",20,78,89);
        TreeSetDemo03Student s2=new TreeSetDemo03Student("赵华",21,86,86);
        TreeSetDemo03Student s3=new TreeSetDemo03Student("李华",21,76,87);
        TreeSetDemo03Student s4=new TreeSetDemo03Student("张华",21,84,85);

        TreeSetDemo03Student s5=new TreeSetDemo03Student("刘华",26,86,83);
        TreeSetDemo03Student s6=new TreeSetDemo03Student("武华",24,86,83);
        //添加集合元素
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);
        //遍历输出结果
        for (TreeSetDemo03Student i:set){
            System.out.println(i.getName()+","+i.getAge()+","+i.getchinese()+","+i.getMath()+","+i.getsum());
        }
    }
}
