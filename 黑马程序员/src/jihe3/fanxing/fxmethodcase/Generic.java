package jihe3.fanxing.fxmethodcase;

public class Generic <T>{
    //成员方法的重载
    /*public void show(String i){
        System.out.println(i);
    }
    public void show(Integer s,String t){
        System.out.println(s+t);
    }
    public void show(boolean j){
        System.out.println(j);
    }*/
    //泛型类改进
/* public void show(T t){
     System.out.println(t);
 }*/
     public <T> void show(T t){
     System.out.println(t);
 }
}
