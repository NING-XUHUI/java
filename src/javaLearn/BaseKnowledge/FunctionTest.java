package javaLearn.BaseKnowledge;

/**
 * @author ningxuhui
 */
public class FunctionTest {
    public static void main(String[] args) {
        int a,b,c;
        a = 1;
        b = 2;
        c = FunctionTest.add(a, b);
        System.out.println("c is " + c);
    }
    public static int add(int m, int n){
        return m + n;
    }
}
