package io流5;

import java.io.FileInputStream;
import java.io.IOException;

// 读
public class InputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        // 读
        //指定读取文件的位置
        //创建读取对象并将文件位置传入其中
        FileInputStream reader = new FileInputStream("C:\\Users\\li'ren'hui\\OneDrive\\桌面\\大二\\大二下\\Java\\IO流\\text\\text1.txt");
        //1、读出字符（用读出字符型）
      /*  int result ;
        while((result=reader.read())!=-1)
        {
            System.out.print((char)result);
        }*/
        // 2、读出汉字（用字节数组型）---(在GBK编码中一个汉字占两个字节，字母占一个字节，在UTF-8编码中一个汉字占三个字节，字母占一个字节；1字节=1btye）
        byte[] bytes = new byte[1024];
        int result;
        while ((result = reader.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, result));
        }
        reader.close();
    }
}
