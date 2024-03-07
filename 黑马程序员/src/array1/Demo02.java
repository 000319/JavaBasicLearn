package array1;
public class Demo02 {
    public static void main(String[] args) {
        int [] array = {17,124,164,142,169,163,152};
        //设置max的初始值为第一个元素
        int max=array[0];
        //遍历数组
        for (int i=0;i<array.length;i++){
            //比较判断
            if (array[i]>max){
                //更换为当前最大值
                max=array[i];
            }
        }
        //输出当前最大值
        System.out.println("最大值为"+max);
    }
}
