public class StaticBlock {
    //static block > anonymous block > constructor function
    //static块只调用一次
    static {
        System.out.println("2222222222222222222222");
    }
    {
        System.out.println("1111111111111111111111");
    }
    public StaticBlock(){
        System.out.println("3333333333333333333333");
    }
    {
        System.out.println("4444444444444444444444");
    }
}
