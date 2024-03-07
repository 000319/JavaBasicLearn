package jihe3.collection;

import java.util.ArrayList;
import java.util.Collection;

//List---列表,Set---集合
/*创建collection集合容器的对象
* 1、方式：多态的方式
* 2、实现类：ArrayList()或LinkedList()*/
public class CollectionDemo01 {
    public static void main(String[] args) {
//创建collection集合的对象
        Collection<String> c = new ArrayList<String>();
        //boolean add(E e)
        c.add("hello");
        c.add("world");
        c.add("java");
        //输出集合对象
        System.out.println(c);
    }
}
