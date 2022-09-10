interface A1{
    void methodA();
}
class Ac implements A1{
    public void methodA(){
        System.out.println("I am A1 from Ac class");
    }
    /*public void method2(){
        System.out.println("I am Method2 from class Ac");
    }*/
}
public class InterfaceTry1 extends Ac{
    public static void main(){
        Ac a = new Ac();
        a.methodA();
        //a.method2();
    }
}
