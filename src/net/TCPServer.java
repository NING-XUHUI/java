package net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP通信的服务器端：接受客户端的请求，读取客户端发送的数据，给客户端回写数据
 * 表示服务器的类：
 *      java.net.ServerSocket:实现服务器套接字
 *  构造方法：
 *      ServerSocket(int port) 创建绑定到指定端口的服务器套接字
 *  服务器端必须明确一件事情，必须的知道是那个客户端请求的服务器
 *  所以可以使用accept方法获取到请求的客户端对象Socket
 *  成员方法：
 *      Socket accept()侦听并接受到此套接字的连接
 *
 *  服务器的实现步骤：
 *      1 创建服务器ServerSocket对象和系统要指定的端口号
 *      2 使用accept方法获取到请求的客户端的Socket对象
 *      3 得到输入流对象
 *      4 使用read读取数据
 *      5 得到输出流对象
 *      6 使用write回写数据
 *      7 释放资源（Socket，ServerSocket）
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1
        ServerSocket server = new ServerSocket(8888);
        //2
        Socket socket = server.accept();
        //3
        InputStream is = socket.getInputStream();
        //4
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //5
        OutputStream os = socket.getOutputStream();
        //6
        os.write("收到谢谢".getBytes());
        socket.close();
        server.close();
    }
}
