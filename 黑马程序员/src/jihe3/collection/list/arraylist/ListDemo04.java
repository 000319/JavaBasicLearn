package jihe3.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*2.4 Listlterator:列表迭代器(不常用）
通过List集合的listlterator()方法得到，所以说它是List集合特有的迭代器
用于允许程序员沿任一方向遍历列表的列表迭代器，在迭代期间修改列表，并获取列表中迭代器的当前位置
Listlterator中的常用方法:
1、E next():返回迭代中的下一个元素
2、boolean hasNext():如果迭代具有更多元素，则返回true
3、E previous():返回列表中的上一个元素
4、boolean hasPrevious():如果此列表迭代器在相反方向遍历列表时具有更多元素，则返回true
5、void add(E e):将指定的元素插入列表
*/
public class ListDemo04 {
    public static void main(String[] args) {
        //创建list集合对象
        List<String> list = new ArrayList<String>();
        //添加集合元素
        list.add("helLo");
        list.add("worLd");
        list.add("java");
        //通过List集合的listlterator()方法得到
        ListIterator<String> lit = list.listIterator();
/*        //1、2、3、4
        //正遍
        while (lit.hasNext()){
            String outcome = lit.next();
            System.out.println(outcome);
        }
        System.out.println("----------------");
        //反遍
        while (lit.hasPrevious()){
            String outcome = lit.previous();
            System.out.println(outcome);
        }*/

        //获取迭代器列表
        while (lit.hasNext()){
            String outcome = lit.next();
            if (outcome.equals("java")){
                lit.add("javaee");
            }
        }
        System.out.println(list);
    }
}
