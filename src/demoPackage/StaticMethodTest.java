public class StaticMethodTest {
    int a = 111111;
    static int b = 222222;
    public static void hello(){
        System.out.println("000000");
        System.out.println(b);
        //System.out.println(a); 不能调用非静态变量
        //hi() 不能调用非静态方法
    }
    public void hi(){
        System.out.println("333333");
        hello();
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        StaticMethodTest.hello();
        StaticMethodTest foo = new StaticMethodTest();
        foo.hi();
        foo.hello();//warning but it is ok
    }
}
