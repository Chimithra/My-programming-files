package zohoFirst;
import java.util.Scanner;
import java.util.ArrayList;


class Student1{
	String Name;
	int Age;
	int Roll;
	public void Student1(String name, int age, int roll){
		this.Name = name;
		this.Age = age;
		this.Roll = roll;
	}
	public void display() {
		System.out.println("Name : "+this.Name+" ");
		System.out.println("Age : "+this.Age+" ");
		System.out.println("Roll : "+this.Roll+" ");
	}
}

public class collectionsProb {
	public static void main(String [] args) {
		ArrayList<Student1>lists= new ArrayList<>();
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the name : ");
	    String name = in.next();
	    System.out.println("Enter the Age : ");
	    int age = in.nextInt();
	    System.out.println("Enter the Roll : ");
	    int roll = in.nextInt();
	    Student1 s = new Student1();
	    s.Student1(name, age, roll);
	    lists.add(0,s);
	    lists.get(0).display();
	}
}
