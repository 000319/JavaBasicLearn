package io流5;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//字节缓冲流(写入）
public class BufferStreamDemo01 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream(
                "C:\\Users\\li'ren'hui\\OneDrive\\桌面\\大二\\大二下\\Java\\IO流\\text\\text1.txt",true);
        BufferedOutputStream  bos = new BufferedOutputStream(fos);

        try {
//            bos.write("泰迪熊\n".getBytes());
//            System.out.println("写入完成");
            String  str = "您好啊" + "\n" + "很高兴见到你";
            byte[] bytes = str.getBytes();
           for(int i =0;i<bytes.length;i++){
               bos.write(bytes[i]);
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
