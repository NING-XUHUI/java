public class BoxClassTest {
    public static void main(String[] args) {
        int i1 = 10;
        Integer i2 = 10;
        System.out.println(i1==i2);

        Integer i3 = new Integer(10);
        System.out.println(i1==i3);

        System.out.println(i2==i3);

        Integer i4 = new Integer(5);
        Integer i5 = new Integer(5);
        System.out.println(i1==(i4+i5));
        System.out.println(i2==(i4+i5));
        System.out.println(i3==(i4+i5));

        Integer i6 = i4 + i5;
        System.out.println(i1==i6);
        System.out.println(i2==i6);
        System.out.println(i3==i6);
    }
}
