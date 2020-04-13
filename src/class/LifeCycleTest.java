public class LifeCycleTest {
    public static void main(String[] args) {
        int a = 0;
        for(int i=0;i<5;i++){
            int k = 0;
            k++;
        }
        if(a > 0){
            Object obj1 = new Object();
            System.out.println("a is positive");
        }else{
            Object obj2 = new Object();
            System.out.println("a is non-positive");
        }
    }
}
