package jihe3.fanxing.fxclasscase;
/*4.1泛型概述
泛型:是JDK5中引入的特性，它提供了编译时类型安全检测机制，该机制允许在编译时检测到非法的类型它的本质是参数化类型，
也就是说所操作的数据类型被指定为一个参数,一提到参数，最熟悉的就是定义方法时有形参，然后调用此方法时传递实参。那么
参数化类型怎么理解呢?顾名思义，就是将类型由原来的具体的类型参数化，然后在使用/调用时传入具体的类型这种参数类型可以
用在类、方法和接口中，分别被称为泛型类、泛型方法、泛型接口
泛型定义格式:
<类型>:指定一种类型的格式。这里的类型可以看成是形参
<类型1,类型2.…>︰指定多种类型的格式，多种类型之间用逗号隔开。
这里的类型可以看成是形参将来具体调用时候给定的类型可以看成是实参，
并且实参的类型只能是引用数据类型心
*/
/*4.2泛型类
泛型类的定义格式:
格式:修饰符class类名<类型>{ ,范例: publicclass Generic<T>{}
此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
*/
public class FxDemo {
    public static void main(String[] args) {
        //一般方式
    /*    Teacher t1=new Teacher();
        t1.setName("彰化");
        Teacher t2=new Teacher();
        t2.setAge(16);
        System.out.println(t1.getName()+","+t2.getAge());
        System.out.println("------------");*/
        //使用泛型
        Generic g1 = new Generic();
        g1.setT("刘德华");
        Generic g2 = new Generic();
        g2.setT(20);
      System.out.println(g1.getT()+","+g2.getT());
    }
}
