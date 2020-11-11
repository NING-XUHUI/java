package javaLearn.Class;

public class Rectangle extends Shape{
    int width;
    int length;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void calArea() {
        System.out.println(this.width * this.length);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        r1.calArea();
    }
}
