import java.util.ArrayList;
import java.util.Scanner;
class Student{
    String Name;
    int Age;
    int Roll_no;
    public void Student(String name, int age, int roll){
        this.Name = name;
        this.Age = age;
        this.Roll_no = roll;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public int getRoll_no() {
        return Roll_no;
    }
    public void setRoll_no(int roll_no) {
        Roll_no = roll_no;
    }
}


public class PojoArrayList {
    public static void main(String [] args){
        System.out.println("Enter the Switch no : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Student>list = new ArrayList<>();
        System.out.println("Enter the number of Students : ");
        int m = in.nextInt();
        switch(n){
            case 1:
                for(int i=0; i<m; i++){
                    System.out.println("Enter the Name"+i+" : ");
                    String st = in.nextLine();
                    in.next();
                    Student o = new Student();
                    o.setName(st);
                    String s1 = o.getName();
                    System.out.println("enter the age");
                    int a= in.nextInt();
                    o.setAge(a);
                    int s2 = o.getAge();
                    System.out.println("enter the roll no");
                    int r= in.nextInt();
                    int s3 = o.getRoll_no();
                    o.setAge(r);


                    // System.out.println(o.getName());


                }
        }
    }
}
