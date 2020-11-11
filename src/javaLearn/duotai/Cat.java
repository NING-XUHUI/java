package javaLearn.duotai;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("cat: i can eat");
    }

    @Override
    public void move() {
        System.out.println("cat: i can move");
    }
}
