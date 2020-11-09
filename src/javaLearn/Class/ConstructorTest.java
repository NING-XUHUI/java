package javaLearn.Class;

/**
 * @author ningxuhui
 */
class MyPairNumber {
    int m;
    int n;
    public MyPairNumber() {
        m = 0;
        n = 0;
    }
    public MyPairNumber(int a) {
        m = a;
        n = 0;
    }
    public MyPairNumber(int a, int b) {
        m = a;
        n = b;
    }
}


public class ConstructorTest {
    public static void main(String[] args) {
        MyPairNumber o1 = new MyPairNumber();
        MyPairNumber o2 = new MyPairNumber(5);
        MyPairNumber o3 = new MyPairNumber(19,3);
    }
}
