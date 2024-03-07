package method2.gzmethod;

public class StudentDemo01 {
    private String name;
    private int age;

    //构造方法
    public StudentDemo01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
    public int show2() {
        return 10;
    }
}
