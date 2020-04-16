public class Rabbit extends LandAnimal implements ClimbTree{
    public void climb(){
        System.out.println("Rabbit:I can climb");
    }
    @Override
    public void eat(){
        System.out.println("Rabbit:I can eat");
    }
}
