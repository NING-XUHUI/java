package net.fileUpload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * 文件上传案例服务器端：读取客户端上传的文件，保存到服务器的硬盘，给客户端回写上传成功
 *
 * 明确：
 *      数据源：客户端上传的文件
 *      目的地：服务器的硬盘
 *
 *  实现步骤：
 *      1 创建一个服务器ServerSocket对象，和系统要指定的端口号
 *      2 使用ServerSocket对象accept获取到请求的客户端的Socket对象
 *      3 使用Socket对象中的getInputStream获取到网络字节对象输入流
 *      4 判断是否存在文件夹，如果不存在则创建
 *      5 创建一个本地的字节输出流
 *      6 使用is对象读取客户端上传的文件
 *      7 使用本地字节输出流对象，write方法，把读取到的文件保存到服务器的硬盘上
 *      8 使用Socket对象中的方法，os，回写"上传成功"
 *      9 释放资源
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1
        ServerSocket server = new ServerSocket(8888);
        //2
        /**
         * 让服务器一直处于accept方法（死循环）
         */
        while(true) {
            Socket socket = server.accept();
            /**
             * 使用多线程技术提高程序的效率
             * 有一个客户端上传文件，就开启一个线程完成文件上传
             */
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //3
                        InputStream is = socket.getInputStream();
                        //4
                        File file = new File("/Users/ningxuhui/Desktop");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        String filename = "itcast" + System.currentTimeMillis() + new Random().nextInt(999999) + ".jpg";
                        // 5
                        FileOutputStream fos = new FileOutputStream(file + "/" + filename);
                        //6
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes)) != -1) {
                            // 7
                            fos.write(bytes, 0, len);
                        }
                        // 8 9
                        socket.getOutputStream().write("上传成功".getBytes());
                        fos.close();
                        socket.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();
        }
    }
}
