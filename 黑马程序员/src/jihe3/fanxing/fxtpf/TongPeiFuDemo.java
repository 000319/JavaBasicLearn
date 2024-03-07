package jihe3.fanxing.fxtpf;

import java.util.ArrayList;
import java.util.List;
//泛型方法VS类型通配符（两者可以混用）
//参考文献：https://blog.csdn.net/sinat_32023305/article/details/83215751?spm=1001.2101.3001.6650.9&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7ERate-9-83215751-blog-123581737.pc_relevant_multi_platform_whitelistv1&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EBlogCommendFromBaidu%7ERate-9-83215751-blog-123581737.pc_relevant_multi_platform_whitelistv1&utm_relevant_index=11
//Object>Number>Integer
/*4.5类型通配符
为了表示各种泛型List的父类，可以使用类型通配符
类型通配符:<?>
List<?>:表示元素类型未知的List，它的元素可以匹配任何的类型
这种带通配符的List仅表示它是各种泛型List的父类，并不能把元素添加到其中

如果说我们不希望List<?>是任何泛型List的父类，只希望它代表某一类泛型List的父类，可以使用类型通配符的上限
●类型通配符上限:<? extends类型>
List< ? extends Number> :它表示的类型是Number或者其子类型

除了可以指定类型通配符的上限，我们也可以指定类型通配符的下限
类型通配符下限:<?super类型>
List<? super Number> :它表示的类型是Number或者其父类型
*/
public class TongPeiFuDemo {
    public static void main(String[] args) {
        //类型通配符
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();
        System.out.println("------------");
        //通配符下限
        List<? extends Number> list5 = new ArrayList<Number>();
        List<? extends Number> list6 = new ArrayList<Integer>();
        System.out.println("-------------");
        //通配符下限
        List<? super Number> list7 = new ArrayList<Object>();
        List<? super Number> list8 = new ArrayList<Number>();
    }
}
