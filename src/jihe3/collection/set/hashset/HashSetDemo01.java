package jihe3.collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

/*
HashSet集合概述和特点HashSet集合特点
1、底层数据结构是哈希表
2、对集合的迭代顺序不作任何保证，也就是说不保证存储和取出的元素顺序一致
3、没有带索引的方法，所以不能使用普通for循环遍历
4、由于是Set集合，所以是不包含重复元素的集合
*/
public class HashSetDemo01 {
    public static void main(String[] args) {
        //创建set集合
        HashSet<String> set = new HashSet<String>();
        //添加集合元素
        set.add("hello");
        set.add("java");
        set.add("world");
        //遍历输出元素
        //方法一：迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String outcome = it.next();
            System.out.println(outcome);
        }
        System.out.println("----------------");
        //方法二：增强for循环
        for (String outcome: set){
            System.out.println(outcome);
        }
    }
}
