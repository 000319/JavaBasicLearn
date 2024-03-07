package method2.cymethod.staticmethod;
/*方法概述:方法(method）是将具有独立功能的代码块组织成为一个整体。使其具有特殊功能的代码集
注意:
1、方法必须先创建才可以使用，该过程称为方法定义
2、方法创建后并不是直接运行的，需要手动使用后才执行，该过程称为方法调用
3、加static的成员方法是静态成员方法可以在本类中直接调用不需要实例化，不加
static的成员方法是非静态成员方法不可以直接调用需要实例化，即创建对象,通过
对象调用（在类中使用另一个类中的成员方法必须要不加static且实例化）
-------------------------------------------------
定义格式1(无参成员方法)：
pubLic static void 方法名( ) {
方法体（内容）
}
定义格式2(含参成员方法)：
pubLic static void 方法名(形参列表) {
方法体（内容）
}
注意：需要返回值时用pubLic static 返回值类型 方法名 (形参列表),不需要时用
pubLic static void 方法名(形参列表)/()这两种,具体功能自行百度。
---------------------------------------------------
调用格式:
1、方法名();----->（static内部类调用）
2、 方法所在类名  对象名（自定义） = new  方法所在类名();
    对象名.方法名();------>(非static内部类调用或外部类调用）
*/
//无参无返回值版
//需求：定义一个方法，在方法中定义一个变量，判断该数据是否是偶数
//1、静态
public class Demo01 {
    public static void main(String[] args) {
         show();
    }
    public static void show (){
        int i=18;
        if (i%2==0){
            System.out.println("为偶数");
        }else
            System.out.println("为奇数");
    }
}
//2、非静态
/*public class Demo01 {
    public static void main(String[] args) {
    //创建对象--实例化
        Demo01 a = new Demo01();
     //调用
         a.show();
    }
    public  void show (){
        int i=18;
        if (i%2==0){
            System.out.println("为偶数");
        }else
            System.out.println("为奇数");
    }
}*/