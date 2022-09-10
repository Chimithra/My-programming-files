class AAA{
    static AAA o = null;
    private AAA(){}
    public static AAA get1(){
        if(o == null)
            o = new AAA();
            return o;
    }
    void display(){
        System.out.println("I am Display");
    }
}
public class Singleton {
    public static void main(String[] args) {
        AAA l = AAA.get1();
        l.display();
    }
}
