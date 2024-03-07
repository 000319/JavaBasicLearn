package io流5;

import java.io.FileOutputStream;
import java.io.IOException;
//字节流写数据加异常处理
/*try{可能出现异常的代码
* }
* catch(异常类名,代码名){异常的处理代码
* }
* finally{执行所有的清除操作
* }*/

public class OutputStreamDemo04 {
        public static void main(String[] args)  {
            FileOutputStream writer = null;
            try {
                writer = new FileOutputStream("C:\\Users\\li'ren'hui\\OneDrive\\桌面\\大二\\大二下\\Java\\IO流\\text\\text2.txt", true);
                writer.write(("\n"+"写入成功").getBytes());

                System.out.println("\n"+"写入成功");
            }
            catch(IOException e){
               e.printStackTrace();
            }
            finally{
                if(writer!=null) {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
        }
    }

