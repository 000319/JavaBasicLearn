package jihe3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Collections类的概述-----Collections类是针对集合操作的工具类
Collections类的常用方法：
1、public static <T extends Comparable<? super T>>
void sort (List<T list):将指定的列表按升序排序
2、public static void reverse (List<?> list):反转指定列表中元素的顺序
3、public static void shuffle (List?> list):使用默认的随机源随机排列指定的列表
*/
public class Demo01 {
    public static void main(String[] args) {
      //创建集合对象
        List<Integer> list = new ArrayList<>();
        //添加元素
        list.add(19);
        list.add(23);
        list.add(27);
        list.add(146);
        list.add(47);
        //1、public static <T extends Comparable<? super T>>  void sort (List<T list):将指定的列表按升序排序
        Collections.sort(list);

       /* //2、public static void reverse (List<?> list):反转指定列表中元素的顺序
        Collections.reverse(list);*/

        /*//3、public static void shuffle (List?> list):使用默认的随机源随机排列指定的列表
        Collections.shuffle(list);*/
        System.out.println(list);
        for (Integer i:list){
            System.out.println(i);
        }
    }
}
