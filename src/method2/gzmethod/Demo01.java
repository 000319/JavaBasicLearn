package method2.gzmethod;

/*学生类构造方法:
作用:创建对象
功能:完成对象数据的初始化
格式:
修饰符类名(参数){)
修饰符一般用:public
*/
public class Demo01 {
    public static void main(String[] args) {
        StudentDemo01 s = new StudentDemo01("理想", 20);
        s.show();
        System.out.println(s.show2());
    }
}
