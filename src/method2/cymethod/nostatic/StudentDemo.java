package method2.cymethod.nostatic;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象---实例化
        Student s = new Student();
        //成员变量赋值
        s.name="张华";
        s.age=18;
        //调用方法
        s.homework();
        s.dohomework();
    }
}
