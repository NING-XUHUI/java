package javaLearn.Class;

public class Rabbit extends LandAnimal implements ClimbTree{
    @Override
    public void climb() {
        System.out.println("climb");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }
}
