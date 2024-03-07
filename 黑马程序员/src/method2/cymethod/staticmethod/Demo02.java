package method2.cymethod.staticmethod;
/*一、带参数方法定义:
格式:
public static void方法名（参数){ ...... }
格式（单个参数):public static void方法名
(数据类型变量名){ ... ... }
范例(单个参数):public static void isEverNumber( int numben) { ......}
格式(多个参数)︰
public static void方法名(数据类型变量名1，数据类型变量名2，...... ......}
范例(多个参数)∶
public static void getMax(int number1 , int number2 ) { .....}
注意:
●方法定义时，参数中的数据类型与安量名都不能缺少，缺少任意一个程序将报错●方法定义时，多个参数之间使用逗号(，)分隔
---------------------------------------------------------------------------
二、带参数方法调用：
格式:
方法名（参数);

格式(单个参数)︰
方法名(变量名/常量值);
范例（单个参数):isEvenNunber ( 5 ) ;

格式(多个参数)∶方法名(变量名1/常量值1，变量名2/常量值2);
范例(多个参数):getMax ( 5,6);
注意:方法调用时，参数的数量与类型必须与方法定义中的设置相匹配，否则程序将报错
*/
//含参版无返回版
//需求：定义一个方法，在方法中定义一个变量，判断该数据是否是偶数
public class Demo02 {
    public static void main(String[] args) {
    /*    //常量值的调用
        getnum(10);*/
        //变量值的调用
        int number =18;
        getnum(number);
    }
    public static void getnum(int i){
        if (i%2==0){
            System.out.println(true);
        }else
            System.out.println(false);
    }
}
