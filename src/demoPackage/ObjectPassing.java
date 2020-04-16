public class ObjectPassing {
    public static void main(String[] args) {
        C a = new C();
        a.setId(10);
        System.out.println(a.getID());
        changeValue(a);
        System.out.println(a.getID());
    }
    public static void changeValue(C b){
        b.setId(20);
        //b = new A();
    }

}
