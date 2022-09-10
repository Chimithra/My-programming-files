abstract class A_1{
    abstract void A1();
    abstract void A2();
}
class B_1 extends A_1{
    void A1(){
        System.out.println("I am A1");
    }

    @Override
    void A2() {
        System.out.println("I am A2");

    }
}
public class AbstractClass {
    public static void main(String[] args) {
    B_1 o = new B_1();
    o.A1();
    o.A2();
    }
}
