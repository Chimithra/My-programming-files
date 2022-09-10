import javax.swing.*;

interface Interface1{
   default void getArea()
   {
       System.out.println("Interfacee1");
   }
}
interface Interface2
{
    default void getArea()
    {
        System.out.println("Interfacee2");
    }
}
// class chimithra implements Interface1,Interface2
//{
//    public void getArea() {
//        System.out.println("1st method");
//
//    }
//}
public class new1 implements Interface2 {
    public static void main(String[] args) {
        new1 ch=new new1();
        ch.getArea();

    }
}
