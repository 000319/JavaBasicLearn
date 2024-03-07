package jihe3.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

/*增强for:简化数组和collection集合的遍历
实现IterabLe接口的类允许其对象成为增强型for语句的目标它是JDK5之后出现的。
其内部原理是一个iterator选代器
格式:
for(元素数据类型变量名:数组或者coLLection集合){
//在此处使用变量即可,该变量就是元素
*/
public class ListDemo05 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list  = new ArrayList<String>();
        //添加集合元素
        list.add("hello");
        list.add("world");
        list.add("java");
        //增强for循环实现输出
        for (String i:list){
            System.out.println(i);
        }

    }
}
