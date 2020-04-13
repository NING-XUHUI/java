public class Son extends Father{
    public void hi(){
        System.out.println("Hi~~~~~");
    }
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.mobile);
        s.hello();
        s.hi();
//        System.out.println(s.money);// 无法访问私有成员
    }
}
