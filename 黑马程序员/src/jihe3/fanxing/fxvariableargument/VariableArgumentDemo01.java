package jihe3.fanxing.fxvariableargument;
/*4.6可变参数---可以优化方法的重载，简化代码
可变参数又称参数个数可变，用作方法的形参出现，那么方法参数个数就是可变的了
●格式:修饰符返回值类型方法名(数据类型...变量名){}
●范例: public static int sum(int... a){ }
可变参数注意事项:
●这里的变量其实是一个数组
如果一个方法有多个参数，包含可变参数，可变参数要放在最后
*/
public class VariableArgumentDemo01 {
    public static void main(String[] args) {
        System.out.println(sum(20));
        System.out.println(sum(20,30));
        sum(10,20,40);
        sum(10,20,38,58);
        sum(10,20,29,29,20);
        sum(10,20,20,50,39,49);
    }
    public static int sum(int...a){
       int sum = 0;
       for (int i:a){
           sum+=i;
       }
        return sum;
    }

}
