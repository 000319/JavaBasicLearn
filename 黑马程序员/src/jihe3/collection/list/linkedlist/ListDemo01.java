package jihe3.collection.list.linkedlist;

import java.util.LinkedList;

/*linkedlist集合的遍历方法同arraylist集合相同，两者都继承于list集合，两者相似可参照学习*/
/*LinkedList集合的特有功能:
1、public void addFirst(E e)。在该列表开头插入指定的元素
2、public void addLast(E e)，将指定的元素追加到此列表的末尾
3、public E getFirst():返回此列表中的第一个元素
4、public E getLast()，返回此列表中的最后—个元素
5、public E removeFirst():从此列表中册除并返回第一个元素
6、public E removeLast():从此列表中册除并返回最后一个元素
*/
public class ListDemo01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
       /* *//*1、public void addFirst(E e)。在该列表开头插入指定的元素
        2、public void addLast(E e)，将指定的元素追加到此列表的末尾*//*
        list.addFirst("0");
        list.addLast("4");*/


       /* *//*3、public E getFirst():返回此列表中的第一个元素
         4、public E getLast()，返回此列表中的最后—个元素*//*
        System.out.println(list.getFirst());
        System.out.println(list.getLast());*/

       /* 5、public E removeFirst():从此列表中册除并返回第一个元素
        6、public E removeLast():从此列表中册除并返回最后一个元素*/
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);
    }
}
