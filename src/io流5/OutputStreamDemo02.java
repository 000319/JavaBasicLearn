package io流5;

import java.io.FileOutputStream;
import java.io.IOException;

//逐项写入
public class OutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream writer = new FileOutputStream("C:\\Users\\li'ren'hui\\OneDrive\\桌面\\大二\\大二下\\Java\\IO流\\text\\text2.txt");
        String str = "您好" + "\n" + "很高兴见到你";
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            writer.write(bytes[i]);
        }
        System.out.println("写入成功");
        writer.close();
    }

}
