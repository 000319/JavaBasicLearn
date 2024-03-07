package jihe3.collection.set.treeset;

import java.util.TreeSet;

/*Treeset集合特点
1:元素有序，这里的顺序不是指存储和取出的顺序，而是按照一定的规则进行排序，具体排序方式取决于构造方法:
      (1)Treeset();根据其元素的自然排序进行排序
      (2)TreeSet(Comparator comparator);根据指定的比较器进行排序
2:没有带索引的方法,所以不能使用普通for循环谊历
3:由子是set集合,所以不包含重复元素的集吝
*/
public class TreeSetDemo01 {
    public static void main(String[] args) {
        // (1)Treeset();根据其元素的自然排序进行排序
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(90);
        set.add(70);
        set.add(40);

        set.add(10);
        for (Integer outcome: set){
            System.out.println(outcome);
        }
    }
}
