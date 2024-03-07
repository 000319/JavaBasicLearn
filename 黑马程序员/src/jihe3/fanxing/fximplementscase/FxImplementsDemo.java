package jihe3.fanxing.fximplementscase;
/*泛型接口的定义格式:·
格式:修饰符interface接口名<类型>{ }
范例:public interface Generic<T> { }
*/
public class FxImplementsDemo {
    public static void main(String[] args) {
      /*Generic<String> g = new GenericImpl<>();
      g.show("王华");
      Generic<Integer> g1 = new GenericImpl<>();
      g1.show(40);*/
        Generic g = new GenericImpl<>();
        g.show(16);
        g.show("王华");
    }
}
