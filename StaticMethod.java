class Class{
    static void method(){
        System.out.println("I am static");
    }
}
class Class1 extends Class{
   static  void method(){
       System.out.println("i am override");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        Class1.method();
    }
}
