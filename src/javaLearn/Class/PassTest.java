package javaLearn.Class;
public class PassTest {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        swap(a, b);
        System.out.println("a : " + a + " " + "b : " + " " + b);
        MyNum n1 = new MyNum();
        n1.setNum(3);
        MyNum n2 = new MyNum();
        n2.setNum(4);
        swap(n1, n2);
        System.out.println("n1 : " + n1.num + " " + "n2 : " + " " + n2.num);
    }

    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }

    public static void swap(MyNum n1, MyNum n2) {
        int s = n1.num;
        n1.num = n2.num;
        n2.num = s;
    }

}
