package jihe3.collection.set.treeset;

public class TreeSetDemo02Student implements Comparable<TreeSetDemo02Student>{
    private String name;
    private  int age;
    public TreeSetDemo02Student(String name,int age){
        this.name= name;
        this.age=age;
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
    @Override
    public int compareTo(TreeSetDemo02Student oe) {
        //return 0;
        //return 5;
        //return -1;
        //按年龄从小到大排列
        int num = this.age- oe.age;
        //int num = oe.age- this.age;
        int num2=(num==0?this.name.compareTo(oe.name):num);
        return num2;
    }
}
