public class Singleton {
    private static Singleton obj = new Singleton();//共享一个对象
    private String content;

    private Singleton() {
        this.content = "abc";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static Singleton getInstance() {
        return obj;
    }

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1.getContent());

        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2.getContent());

        obj2.setContent("def");
        System.out.println(obj1.getContent());
        System.out.println(obj2.getContent());

        System.out.println(obj1 == obj2);
    }
}
