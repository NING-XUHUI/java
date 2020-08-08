package net.fileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 文件上传案例的客户端：读取本地文件，上传到服务器，读取服务器回写的数据
 * 明确：
 *      数据源：./
 *      目的地：服务器
 *
 *  实现步骤：
 *      1 创建一个本地字节输入流FileInputStream对象，构造方法中绑定要读取的数据源
 *      2 创建一个客户端Socket对象，构造对象绑定服务器的IP地址和端口号
 *      3 使用Socket中的方法getOutputStream，获取os对象
 *      4 使用本地字节输入流对象中的方法read读取本地文件
 *      5 使用网络字节输出流os中的write方法，把读取到的文件上传到服务器
 *      6 使用Socket中的方法getInputStream，获取is对象
 *      7 使用is中的方法read，读取服务器回写的数据
 *      8 释放资源（本地文件流，Socket）
 *
 */

public class TCPClient {
    public static void main(String[] args) throws IOException {
        // 1
        FileInputStream fis = new FileInputStream("/Users/ningxuhui/Desktop/testpic.png");
        // 2
        Socket socket = new Socket("127.0.0.1",8888);
        // 3
        OutputStream os = socket.getOutputStream();
        // 4 5
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            os.write(bytes,0,len);
        }
        socket.shutdownOutput();
        // 6 7
        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        // 8
        fis.close();
        socket.close();
    }
}
