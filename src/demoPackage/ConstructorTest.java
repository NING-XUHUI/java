public class ConstructorTest {
    public static void main(String[] args) {
        MyPairNumber obj1 = new MyPairNumber();
        MyPairNumber obj2 = new MyPairNumber(5);
        MyPairNumber obj3 = new MyPairNumber(10,20);

        System.out.println("obj1 has " + obj1.m + "," + obj1.n);
        System.out.println("obj2 has " + obj2.m + "," + obj2.n);
        System.out.println("obj3 has " + obj3.m + "," + obj3.n);
    }
}
