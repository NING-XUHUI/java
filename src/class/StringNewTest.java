public class StringNewTest {
    public static void main(String[] args) {
        String s0 = "abcdef";
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println("=================");

        String s5 = s1 + "def";
        String s6 = "abc" + "def";
        String s7 = "abc" + new String("def");
        System.out.println(s5 == s6);
        System.out.println(s5 == s7);
        System.out.println(s6 == s7);
        System.out.println(s0 == s7);
        System.out.println("==================");

        String s8 = s3 + "def";
        String s9 = s4 + "def";
        String s10 = s3 + new String("def");
        System.out.println(s8 == s9);
        System.out.println(s8 == s10);
        System.out.println(s9 == s10);

        String a = new String("abc");
        String b = a;
        System.out.println(b);
        a = "def";
        System.out.println(b);
//        change(a);
//        System.out.println(a);
    }
    public static void change(String b){
        b = "def";
    }
}
