package javaLearn.duotai;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] as = new Animal[4];
        as[0] = new Cat();
        as[1] = new Dog();
        as[2] = new Cat();
        as[3] = new Dog();

        for (int i = 0; i < as.length; i++) {
            as[i].move();
        }
        for (int i = 0; i < as.length; i++) {
            haveLunch(as[i]);
        }
        haveLunch(new Cat());
        haveLunch(new Dog());
        haveLunch(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("i can eat from an anonymous class");
                    }

                    @Override
                    public void move() {
                        System.out.println("i can move from an anonymous class");
                    }
                }
        );
    }

    public static void haveLunch(Animal a) {
        a.eat();
    }
}
