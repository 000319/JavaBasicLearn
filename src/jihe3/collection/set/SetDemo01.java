package jihe3.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//Java——HashSet和TreeSet的区别------https://blog.csdn.net/coding_1994/article/details/80553554
/*Set集合特点
1、不包含重复元素的集合
2、没有带索引的方法，所以不能使用昔通for-循环追历
只有迭代器和增强for循环两种遍历方式
3、HashSet:对集合的迭代顺序不作任何保证
*/
/*哈希值:
JDk根据对象的地址或者字符串或者数字算出来的int类型的数值object类中有一个方法可以获取对象的哈希值
public int hashCode():返回对象的哈希码值
*/
public class SetDemo01 {
    public static void main(String[] args) {
        //创建集合set对象
        Set<String> set = new HashSet<String>();
        //添加集合元素
        set.add("hello");
        set.add("java");
        set.add("world");
        set.add("java");
        //遍历输出元素
        //方式一：迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String outcome = it.next();
            System.out.println(outcome);
        }
        System.out.println("-----------------");
        //方式二：增强for循环
        for (String i :set){
            System.out.println(i);
        }
    }
}
