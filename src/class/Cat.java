public class Cat implements SpecialAnimal {
    @Override
    public void move(){
        System.out.println("Cat:I can move");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        //cat.color = "white"//error
    }
}
