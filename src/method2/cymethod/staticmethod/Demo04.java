package method2.cymethod.staticmethod;

import java.util.Scanner;
/*一、带返回值方法定义：
格式:public static 数据类型 方法名（参数){
return数据;}
范例1:public static boolean isEvenNumber( int number ) {
return true;}
范例2:public static int
getMax( int a， int b ) {
return 100;}
注意:方法定义时return后面的返回值与方法定义上的数据类型要匹配，否则程序将报错
------------------------------------------------------------
二、带返回值方法调用
格式1:方法名(参数);---不推荐;范例:isEvenNumber ( 5 );
格式2:数据类型变量名=方法名(参数)---推荐;范例:boolean flag = isEvenNumber ( 5 );
注意:方法的返回值通常会使用变量接收，否则该返回值将无意义
*/
//含返回值版
//需求:定义一个方法，该方法接收一个参数，判断该数据是否是偶数，并返回真假值
public class Demo04 {
    public static void main(String[] args) {
/*          //常量
            Boolean outcome=isEvenNumber(18);
            System.out.println(outcome);*/
            //变量(由控制台输入)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number = sc.nextInt();
        //调用
        Boolean outcome=isEvenNumber(number);
        System.out.println("当前结果为："+outcome);
    }
    public static boolean isEvenNumber(int num) {
        if (num%2==0){
            return true;
        }else
            return false;
    }
}
