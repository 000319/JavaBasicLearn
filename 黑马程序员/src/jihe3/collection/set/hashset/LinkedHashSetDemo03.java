package jihe3.collection.set.hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*linkedHashset集合特点
1:哈希表和链表实规的set接口，具有可预测的迭代次序
2:由链表保证元素有序，也就是说元素的存储和取出顺序是一致的
3:由哈希表保证元素唯—，也就是说没有重复的元素
人话：既有list集合的顺序输出的特性又有set集合的元素不重复的特性
*/
public class LinkedHashSetDemo03 {
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        //添加集合元素
        set.add("hello");
        set.add("java");
        set.add("world");
        set.add("hello");
        //输出元素方一
        for (String outcome:set){
            System.out.println(outcome);
        }
        System.out.println("-----------");
        //方二
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String outcome = iterator.next();
            System.out.println(outcome);
        }
    }
}
