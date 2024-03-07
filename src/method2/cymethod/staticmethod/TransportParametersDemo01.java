package method2.cymethod.staticmethod;

/*方法参数传递(基本类型)
对于基本数据类型的参数，形式参数的改变，不影响实际参数的值
*/
public class TransportParametersDemo01 {
    public static void main(String[] args) {
        int num1 = 100;
        System.out.println("修改前" + num1);
        TransportParametersDemo01 a = new TransportParametersDemo01();

        a.getnum(num1);
        System.out.println("修改后" + num1);
    }

    public  int getnum(int number) {
        return 200;
    }
}
