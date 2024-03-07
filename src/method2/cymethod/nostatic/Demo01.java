package method2.cymethod.nostatic;
/*1、加static的成员方法是静态成员方法可以在本类中直接调用不需要实例化，不加
static的成员方法是非静态成员方法不可以直接调用需要实例化，即创建对象,通过
对象调用（在类中使用另一个类中的成员方法必须要不加static且实例化）
2、成员变量赋值：对象名.变量名=数据;
3、在外部调用、赋值时也一样*/
public class Demo01 {
    public static int i;
    public static void main(String[] args) {
        //创建对象--实例化
        Demo01 a = new Demo01();
        //赋值
        a.i=17;
        //调用
        a.show();
    }
    public  void show (){
        if (i%2==0){
            System.out.println("为偶数");
        }else
            System.out.println("为奇数");
    }
}
