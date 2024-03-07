package jihe3.fanxing.fxmethodcase;
/*泛型方法的定义格式:
格式:修饰符<类型>返回值类型方法名(类型变量名){}
范例: public <T> void show(T t){}
*/
public class FxDemoCase {
    public static void main(String[] args) {
        //成员方法的重载
    /*Generic s1 = new Generic();
    s1.show("王华");
    s1.show(18,"张雷");
    s1.show(false);*/

        //泛型类改进1--指定数据类型
        /*Generic<String> g1 = new Generic<>();
        g1.show("刘明");
        Generic<Integer> g2 = new Generic<>();
        g2.show(18);
        Generic<Boolean> g3 = new Generic<>();
        g3.show(true);
        System.out.println("-----------");*/
        //泛型类改进2--不指定数据类型
       /* Generic s = new Generic();
        s.show("庄华");
        s.show(19);
        s.show(true);*/

        //泛型方法
        Generic g = new Generic();
        g.show(10);
        g.show("庄华");

    }
}
