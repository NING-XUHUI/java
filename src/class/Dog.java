public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog:I can eat");
    }

    @Override
    public void move() {
        System.out.println("Dog:I can move");
    }
}
