package io流5;
import java.io.*;

//复制视频
//方式1：基本字节流一次读取一个字节(弊端：慢慢慢，我靠忙的要死）
//方式2：基本字节流一次读取一个字节数组
//方式3：字节缓冲流一次读取一个字(不演示）
//方式3：字节缓冲流一次读取一个字节数组
public class CopyAudioDemo01 {
    public static void main(String[] args) throws IOException{
        //记录开始时间
        long startTime = System.currentTimeMillis();
   //记录结束的时间
        long endTime = System.currentTimeMillis();
        //总耗时
        System.out.println("总耗时为："+(endTime-startTime)+"毫秒");
       // method1();
        //method2();
       method4();
    }
 /*   public static void method1 ()throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\li'ren'hui\\OneDrive\\桌面\\我看中国外交\\附件\\五项原则.mp4");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\li'ren'hui\\OneDrive\\桌面\\大二下\\java界面代码\\IO流\\text\\五项原则.mp4");

        int result;
        while((result=fis.read())!=-1){
            fos.write(result);
        }
       fis.close();
        fos.close();
    }*/


    /*public static void method2 ()throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\li'ren'hui\\OneDrive\\桌面\\我看中国外交\\附件\\五项原则.mp4");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\li'ren'hui\\OneDrive\\桌面\\大二下\\java界面代码\\IO流\\text\\五项原则.mp4");
byte [] bytes = new byte[4096];
        int result;
        while((result=fis.read(bytes))!=-1){
            fos.write(bytes,0,result);
        }
        fis.close();
        fos.close();
    }*/


    public static void method4 ()throws IOException {

        BufferedInputStream bis= new BufferedInputStream(new FileInputStream("C:\\Users\\li'ren'hui\\OneDrive\\桌面\\我看中国外交\\附件\\五项原则.mp4"));

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\li'ren'hui\\OneDrive\\桌面\\大二下\\java界面代码\\IO流\\text\\五项原则.mp4"));
        int result;
        while((result=bis.read())!=-1){
            bos.write(result);
        }
        bis.close();
        bos.close();
    }
}
