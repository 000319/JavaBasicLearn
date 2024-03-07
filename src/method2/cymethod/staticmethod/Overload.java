package method2.cymethod.staticmethod;

import java.util.InputMismatchException;
import java.util.Scanner;

/*定义：1、在同一个类中,方法名相同
2、参数、参数类型、参数数量有一个不同*/
//需求1、求两个int类型数据和的方法
//需求2、求两个double类型数据和的方法
//需求3、求三个int类型数据和的方法
public class Overload {
    public static void main(String[] args) {
        try {
            System.out.println("请输入第一个数字：");
            Scanner sc1 = new Scanner(System.in);
            int num1 = sc1.nextInt();
            System.out.println("请输入第二个数字：");
            Scanner sc2 = new Scanner(System.in);
            int num2 = sc2.nextInt();
            int outcome1 = show(num1, num2);
            System.out.println("结果为:" + outcome1);

            System.out.println("请输入第三个数字：");
            Scanner sc3 = new Scanner(System.in);
            int num3 = sc3.nextInt();
            int outcome2 = show(num1, num2, num3);
            System.out.println("结果为:" + outcome2);

            System.out.println("请输入第四个数字：");
            Scanner sc4 = new Scanner(System.in);
            double num4 = sc4.nextDouble();

            System.out.println("请输入第五个数字：");
            Scanner sc5 = new Scanner(System.in);
            double num5 = sc5.nextDouble();
            double outcome3 = show(num4, num5);
            System.out.println("结果为:" + outcome3);
        } catch (InputMismatchException e)
        {
            System.out.println("请输入数字：");
        }
    }
    //需求1、求两个int类型数据和的方法
    public static int show(int a,int b){
        int num = a+b;
        return num;
    }
    //需求2、求两个double类型数据和的方法
    public  static double show(double a,double b){
        double num = a+b;
        return num;
    }
    //需求3、求三个int类型数据和的方法
    public static int show(int a,int b,int c){
        int num = a+b+c;
        return num;
    }
}
