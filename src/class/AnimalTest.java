import org.jetbrains.annotations.NotNull;

/**
 * @author ningxuhui
 */
public class AnimalTest {
    public static void haveLunch(@NotNull Animal a) {
        a.eat();
    }

    public static void main(String[] args) {
        Animal[] as = new Animal[4];
        as[0] = (Animal) new Cat();
        as[1] = new Dog();
        as[2] = (Animal) new Cat();
        as[3] = new Dog();

        for (int i = 0; i < as.length; i++) {
            as[i].move();
        }
        for (int i = 0; i < as.length; i++) {
            haveLunch(as[i]);
        }
        haveLunch((Animal) new Cat());
        haveLunch(new Dog());
        haveLunch(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("I can eat from an anonymous class");
                    }

                    @Override
                    public void move() {
                        System.out.println("I can move ......");
                    }
                }
        );
    }
}
