import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class Atry1 {
    void Try() {

        try {
            // code that generate exception
            int divideByZero = 5 / 0;
            System.out.println("Rest of code in try block");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
    }
}
class Atry2 extends Atry1{
    void Try1() {
        try {
            // code that generates exception
            int divideByZero = 5 / 0;
        } catch (Exception e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
        finally {
            System.out.println("This is the finally block");
        }
    }
}
class Atry {
    public static void main(String[] args) {
        Atry1 o = new Atry1();
        o.Try();
       // Atry2 o1 = new Atry2();
       // o1.Try1();
    }
}