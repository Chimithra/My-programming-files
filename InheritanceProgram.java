class Chitra{
    String name;
     void otherFace(){
        System.out.println("other face of my mom is : "+name);
    }
}
class Meena extends Chitra{
    String name1;
    @Override    //Overriding
    protected void otherFace(){
        super.otherFace();
        System.out.println("other face of Child : "+ name1);
    }
}
public class InheritanceProgram {
    public static void main(String [] args){
        Meena o = new Meena();
        o.name1= "Good Girl";
        o.otherFace();
        Chitra o1 = new Chitra();
        o1.name = "Ratchasi";
        o1.otherFace();
    }
}
