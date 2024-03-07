package io流5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyjpgDemo01 {

    public static void main(String[] args)  throws IOException {
        /*一、基本字节流的字节数组法*/
        //写入图片
        FileInputStream writer = new FileInputStream("C:\\Users\\li'ren'hui\\OneDrive\\桌面\\壁纸\\下载 (20).png");
        //输出图片
        FileOutputStream reader = new FileOutputStream("C:\\Users\\li'ren'hui\\OneDrive\\桌面\\大二\\大二下\\Java\\IO流\\text\\下载 20.png");
        byte[] text= new byte[2048];
        int result ;
        while((result=writer.read(text))!=-1)
        {
          reader.write(text ,0,result);
        }
        reader.close();
        writer.close();

          /*二、基本字节流的字符串法*/
     /*   FileInputStream writer = new FileInputStream("C:\\Users\\li'ren'hui\\OneDrive\\桌面\\壁纸\\2.jpg");
        //输出图片
        FileOutputStream reader = new FileOutputStream("C:\\Users\\li'ren'hui\\OneDrive\\桌面\\大二\\大二下\\Java\\IO流\\text\\2.jpg");
        int result ;
        while((result=writer.read())!=-1)
        {
            reader.write(result);
        }
        reader.close();
        writer.close();*/
    }
}
