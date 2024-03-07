package method2.cymethod.staticmethod;
/*方法参数传递(引用类型)
对于引用类型的参数，形式参数的改变，影响实际参数的值
*/
public class TransportParametersDemo02 {
    public static void main(String[] args) {
        int [] arry={10,20,34};
        System.out.println("修改前："+arry[1]);
        show(arry);
        System.out.println("修改后："+arry[1]);
    }
    public static void show(int[] arry){
        arry [1]=200;
    }
}
