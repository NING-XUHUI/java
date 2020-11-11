package javaLearn.Class;

public abstract class LandAnimal implements Animal{
    public abstract void eat();

    @Override
    public void move() {
        System.out.println("I can walk by feet");
    }
}
