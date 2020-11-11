package javaLearn.Class;

public class B extends A {
    public B() {
        super();
        System.out.println("3333333");
    }
    public B(int a) {
        super(a);
        System.out.println("4444444");
    }

    public static void main(String[] args) {
        B o1 = new B();
        System.out.println("========");
        B o2 = new B(10);
    }
}
