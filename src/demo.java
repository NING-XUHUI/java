public class demo {
    public static void main(String[] args) {
//        byte a = (byte) -128;
//        System.out.println(a);
//        byte b = (byte) 127;
//        System.out.println(b);
//        byte c = (byte) -129;
//        System.out.println(c);
//        byte d = (byte) 128;
//        System.out.println(d);
//        short a1 = 32767;
//        System.out.println(a1);
////        short a2 = 32768; /越界
//
//        int b1 = 2147483647;
//        System.out.println(b1);
////        int b2 = 2147483648;越界
//
//        long c1 = 1000000000000L;
//        System.out.println(c1);
//
//        long c2 = 2147483647;// 隐式做了从int变成long的操作
//        System.out.println(c2);
//
//        long c3 = 2147483648L;// 去掉L将报错
//        System.out.println(c3);
/*
        char a = 'a';
        char b =97;//根据ascii码转化为a
        char c = '我';
        char d = '\u4e00';//\u4e00--\e9fa5两万多汉字
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
*/
        int a = 10;
        int b = 3;
        int c = a + b;
        int d = a - b;
        int e = a / b;
        int f = a % b;
        System.out.println(c + "," + d + "," + e + "," + f);
        System.out.println(a >> 1);
        System.out.println(a << 1);
        System.out.println((5 > 2) && ((2 < 3) || (!false)));
    }
}
