/**
 * @author ningxuhui
 */
public class ArgumentPassingTest {
    public static void main(String[] args) {
        int a = 1, b = 2;
        swap(a, b);
        System.out.println("a is " + a + ", b is " + b);

        MyNumber obj1 = new MyNumber();
        MyNumber obj2 = new MyNumber();
        obj1.num = 10;
        swap(obj1, obj2);
        System.out.println("obj1 is " + obj1.num + ", obj2 is " + obj2.num);
    }

    public static void swap(int m, int n) {
        int s = m;
        m = n;
        n = s;
    }

    public static void swap(MyNumber obj3, MyNumber obj4) {
        int s = obj3.num;
        obj3.num = obj4.num;
        obj4.num = s;
    }
}
