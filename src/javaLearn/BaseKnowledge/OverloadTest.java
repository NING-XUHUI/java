package javaLearn.BaseKnowledge;

public class OverloadTest {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(add(1, 2));
    }
    public static int add(int m, int n) {
        return m + n;
    }
    public static double add(double m, double n){ // 重载了上一个add函数
        return m + n;
    }
}
