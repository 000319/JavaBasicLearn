package io流5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
//缓冲字节流（读取）
public class BufferStreamDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(
                "C:\\Users\\li'ren'hui\\OneDrive\\桌面\\大二\\大二下\\Java\\IO流\\text\\text1.txt"));
   //读字符串（连续读取）
    byte[] bytes=new byte[1024];
    int result;
    while((result=bis.read(bytes))!=-1) {
        System.out.println(new String(bytes, 0, result));

       /* 读字符串（单个读取）
       int result;
         while((result=bis.read())!=-1)
        {System.out.println((char)result);
         }bis.close();*/
              }
        bis.close();
        }
    }

