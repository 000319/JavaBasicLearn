package jihe3.collection;

import java.util.ArrayList;
import java.util.Collection;

/*collection集合的常用方法
* 1、boolean add(E e);添加元素
* 2、boolean remove(Object o);从集合中移出指定元素
* 3、void clear();清空集合中的元素
* 4、boolean contains(Object o);判断集合中是否存在指代那个元素
* 5、boolean isEmpty();判断集合是否为空
* 6、int size();集合的长度，也就是集合中元素的长度
*
* 快捷操作：1、选中方法类比如选中ArrayList Ctrl+b跟进调出所有方法 Alt+7调出结构图窗口便于查找具体的方法
* 2、选中方法类比如选中ArrayList Ctrl+b跟进调出所有方法 然后点击视图——>工具窗口——>结构*/
public class CollectionDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<String>();
        //1、boolean add(E e);添加元素
        c.add("hello");
        c.add("world");
        //控制台输出
        System.out.println(c);


        /*//2、boolean remove(Object o);从集合中移出指定元素
        c.remove("hello");
        //控制台输出
        System.out.println(c);*/


       /* //3、void clear();清空集合中的元素
        c.clear();
        //控制台输出
        System.out.println(c);*/

        /*//4、boolean contains(Object o);判断集合中是否存在指代那个元素
        System.out.println(c.contains("java"));*/


       /* //5、boolean isEmpty();判断集合是否为空
        System.out.println(c.isEmpty());*/

        //6、int size();获取集合的长度，也就是集合中元素的长度
        System.out.println("长度为:"+c.size());

    }
}
