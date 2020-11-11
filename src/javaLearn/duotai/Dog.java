package javaLearn.duotai;

public class Dog implements Animal{
    @Override
    public void move() {
        System.out.println("dog: i can eat");
    }

    @Override
    public void eat() {
        System.out.println("dog: i can move");
    }
}
