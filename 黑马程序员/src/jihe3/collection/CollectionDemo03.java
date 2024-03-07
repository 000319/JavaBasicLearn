package jihe3.collection;
import  java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//从集合中拿元素
//Collection的遍历：遍历就是一个一个的把容器中的元素访问一遍。
// 开发中经常要统计元素的总和， 找最值，找出某个数据然后干掉等等业务都需要遍历
//遍历的方法：Collection中集合的遍历方式有三种:
//
//（1）迭代器（collection集合中的迭代器:集合特有的遍历方式
//
//（2）增强for:最方便的遍历方式-----List包(Demo05)中有。
//
// (3)普通for:带有索引的遍历方式

//方法1、2、3在包collectiondemocase中有

// （4）JDK 1.8开始之后的新技术Lambda表达式(了解)
/*1、Iterator:迭代器，集合的专用遍历方式
* 2、Iterator<E>iterator()返回此集合中元素的迭代器，
* 通过集合的iterator()方法得到迭代器是通过集合的iterator()方法得到的，
* 所以我们说它是依换于集合而存在的
* 3、Iterator中的常用方法
* 4、E next(:返回迭代中的下一个元素
* 5、boolean hasNext():如果迭代具有更多元素，则返回true*/
public class CollectionDemo03 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<String>();
        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
        //Iterator<E> iterator(),返回此集合中元素的迭代器，通过集合的iterator()方法得到的，
         Iterator<String> it = c.iterator();
         //拿到元素并打印到输出台
       /* 输出方式1、System.out.println(it.next());
        System.out.println(it.next());*/


        /*输出方式2、for(int i=0;i<c.size();i++){
            System.out.println(it.next());
        }
        System.out.println(c.size());*/

        //输出方式3、boolean hasNext():如果迭代具有更多元素，则返回true
        while (it.hasNext()) {
            String outcome = it.next();
            System.out.println(outcome);
        }
    }
}


