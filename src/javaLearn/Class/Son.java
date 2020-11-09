package javaLearn.Class;

public class Son extends Father {
    public void hi() {
        System.out.println("hi~~~~~~");
    }

    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.mobile);
        s.hello();
        s.hi();
    }
}
