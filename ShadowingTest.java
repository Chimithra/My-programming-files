
public class ShadowingTest {
//    public int X;
//    class FirstLevel{
//        public int X = 1;
//        void method1(int E){
//            System.out.println("x = " + X);
//            System.out.println("this.x = " + this.X);
//            System.out.println("ShadowTest.this.x = " + ShadowingTest.this.X);
//        }
//    }
    public static void main(String[] args) {
//        ShadowingTest.FirstLevel f = new ShadowingTest().new FirstLevel();
//        f.method1(5);
        int [] arr = {1, 2, 3};
        String s = "";
        for(int i=0; i<arr.length; i++){
            s += arr[i];
        }
        System.out.println(s);
        for(int i=0; i<arr.length; i++){
            int digit = arr[i];
            int total = digit*10;
        }
    }
}
