package Assignment;
class ClassA{
    void method1(){
        System.out.println("I am in Class A");
    }
}
class ClassB{
    void method2() {
        ClassA a = new ClassA() {
            void method3() {
                System.out.println("I am in ClassB");
            }
        };
        a.method1();
    }
}
public class Annonymous {
    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.method2();
    }
}
