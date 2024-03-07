package array1;
//数组的设置和遍历
public class Demo01 {
    public static void main(String[] args) {
        //定义一个数组
        int [] array = new int[10];
        //int [] array = {1、2、3、5、};

        //数组的遍历
       /* for (Integer i:array){
            System.out.println("a"+"["+i+"]"+"="+array[i]);
        }*/

     /*   for (int i=0;i<5;i++){
            System.out.println("a"+"["+i+"]"+"="+array[i]);
        }
        System.out.println(array.length);*/

        for (int i=0;i<array.length;i++){
            System.out.println("a"+"["+i+"]"+"="+array[i]);
        }
        System.out.println(array.length);
    }
}
