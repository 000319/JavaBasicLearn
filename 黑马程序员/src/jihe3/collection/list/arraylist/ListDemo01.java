package jihe3.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
List集合子类特点List集合常用子类: ArrayList,LinkedList
ArrayList:底层数据结构是数组，查询快，增删慢
LinkedList:底层数据结构是链表，查询慢，增删快
*/
/*List集合特点
有序:存储和取出的元素顺序一致
可重复:存储的元素可以重复
*/
/*注意：
 1、当使用List<String> list = new ArrayList<String>();或List<String> list = new LinkedList<String>();
 时只能使用集合List中的公用方法不能调用 ArrayList()和Linkedlist()内的特有方法
 * 2、当使用ArrayList/LinkedList<String> list = new ArrayList/LinkedList<String>()时可以使用其特有方法
 * 3、两者区别在于1更加灵活可以简单的改变集合类型，2可以实现特有方法但无特别需求时推荐使用1
 * 参考网址：https://blog.csdn.net/weixin_41962432/article/details/102458326
 --------------------------注意：set集合同理--------------------------------
 */
public class ListDemo01 {
    public static void main(String[] args) {
        //创建List的集合对象
        ArrayList<String> list = new ArrayList<String>();
        //添加集合元素
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hello");
        //使用迭代器遍历出元素
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String outcome = it.next();
            System.out.println(outcome);
        }
    }
}

