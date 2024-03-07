package jihe3.collection.set.treeset;

public class TreeSetDemo03Student {
    private  String name;
    private int age;
    private int chinese;
    private int math;
    public  TreeSetDemo03Student(String name, int age,int chinese,int math){
        this.name=name;
        this.age=age;
        this.chinese=chinese;
        this.math=math;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public int getchinese() {
        return chinese;
    }
    public void setChinese( int chinese) {
        this .chinese = chinese;
    }
    public int getMath( ) {
        return math;
    }
    public void setMath( int math) {
        this.math = math;
    }
    public int getsum() {
return this.chinese + this.math;
}

}
