class A{
    void common(){
        System.out.println("I am Common from A class of method");
    }
}
interface B{
    void common();
}
class D implements B{
    public void common(){ // should be strong access than Where it came from
        System.out.println("I am from Interface ");
    }
    void m2(){
        System.out.println("I am M2");
    }
}
class E extends A{
    void common(){ // should be strong access than Where it came from
        System.out.println("I am E extends from A  ");
    }
}

public class InheritancePracticeDifference extends A implements B {
    public void common(){ // should be strong access modifier from interface
        System.out.println("I am Common from B class of method extends A");
    }
    public static void main(String [] args){
        InheritancePracticeDifference i = new InheritancePracticeDifference();
        i.common();
        D d = new D();
        d.common();
        d.m2();
        E e = new E();
        e.common();
    }
}
