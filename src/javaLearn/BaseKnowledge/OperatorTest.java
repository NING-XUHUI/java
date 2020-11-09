package javaLearn.BaseKnowledge;

public class OperatorTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = a + b;
        int d = a - b;
        int e = a / b;
        int f = a % b;
        System.out.println(c + "," + d + "," + e + "," + f);
        System.out.println(a>>1);
        // 右移 除以2
        System.out.println(a<<1);
        // 左移 乘以2
        System.out.println((5>2) && ((2<3)||(!false)));
    }
}
