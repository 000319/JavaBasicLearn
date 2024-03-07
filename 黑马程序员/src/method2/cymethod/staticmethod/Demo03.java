package method2.cymethod.staticmethod;
import java.util.Scanner;
/*需求:
设计一个方法用于打印两个数中的较大数，数据来自于方法参数
思路:
1 :定义一个方法,用于打斗两个数字中的较大数，例如getNax( )
2:方法定义两个参数，用子接收两个数字
3:使用分支语句分两种情况对两个数宁的大小关系进行处理
4:在main()方法中调用定义好的方法（使用常量)
5 :在main()方法中调用定义好的方法(使用变量)
*/
//含参无返回值版
//需求：定义一个方法，在方法中定义两个变量，大小
public class Demo03 {
    public static void main(String[] args) {
         /*//常量
        getNax(10,20);*/
        //变量(由控制台赋值)
        System.out.println("请输入第一个数据：");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        System.out.println("请输入第二个数据：");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        getNax(num1,num2);
    }
    public static void getNax(int a,int b){
         if (a==b){
             System.out.println("a"+"="+"b");
         }else if (a<b){
             System.out.println(b);
         }else
             System.out.println(a);
    }
}
