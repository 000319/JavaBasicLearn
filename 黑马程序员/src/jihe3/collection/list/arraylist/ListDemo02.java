package jihe3.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

/*list集合特有方法:
1、void add(int index,E element):在此集合中的指定位置插入指定的元素
2、E remove(int index):册除指定索引处的元素，返回被册删除的元素
3、E set(int index,E element):修改指定索引处的元素，返回被修改的元素
4、E get(int index):返回指定索引处的元素
*/
public class ListDemo02 {
    public static void main(String[] args) {
        //创建集合List的对象
        List<String> list = new ArrayList<String>();
        //添加集合元素
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hello");

       /* //1、void add(int index,E element):在此集合中的指定位置插入指定的元素
        list.add(2,"yes");*/

        /*//2、E remove(int index):册除指定索引处的元素，返回被册删除的元素
        list.remove(0);*/


        /*//3、E set(int index,E element):修改指定索引处的元素，返回被修改的元素
        list.set(2,"javas");*/


        //4、E get(int index):返回指定索引处的元素
        System.out.println(list.get(0));
        //输出集合对象
        System.out.println(list);

        //使用增强for循环遍历
        for(int i=0;i< list.size();i++){
            String outcome = list.get(i);
            System.out.println(outcome);
        }
    }
}

