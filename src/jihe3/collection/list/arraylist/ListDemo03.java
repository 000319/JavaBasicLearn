package jihe3.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*并发修改异常
ConcurrentModificationException
产生原因
迭代器遍历的过程中，通过集合对象修改了集合中元素的长度，造成了迭代器获取元素中判断预期修改值和实际修改值不一致
心*/
/*需求:
 我有一个集合:List<String> list = new ArrayList<String>();
 里面有三个元素: list.add("helLo" );list.add("worLd" );List.add( "java");
 遍历集合，得到每一个元素，看有没有"worLd"这个元素，如果有，我就添加一个"javaee"元素，
 */
public class ListDemo03 {
    public static void main(String[] args) {
        //创建list集合对象
        List<String> list = new ArrayList<String>();
        //添加集合元素
        list.add("helLo" );
        list.add("worLd" );
        list.add("java");
        //遍历集合，得到每一个元素，看有没有"worLd"这个元素，如果有，我就添加一个"javaee"元素
        Iterator<String> it =list.iterator();
        while (it.hasNext()){
            String s = it.next();
            if (s.equals("world")){
                list.add("javaee");
            }
        }
        System.out.println(list);
    }
}

