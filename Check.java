class Check1{
    void method(int a, int b){
        System.out.println("2 with int ");
    }
    void method2(int a){
        System.out.println("1 with int");
    }
}
class check2 extends Check1{
    void method2(int a){
        System.out.println("jgsd");
    }
}
public class Check {
    public static void main(String[] args) {
        check2 c = new check2();
        c.method2(5);
    }
}
