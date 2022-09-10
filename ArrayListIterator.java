package zohoFirst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class student{
	String Name;
	int Age;
	int Roll_no;
	public void student(String Name, int age, int roll_no) {
		this.Name = Name;
		this.Age = age;
		this.Roll_no = roll_no;
	}
	public void display() {
		System.out.println("NAME : "+ this.Name+" ");
		System.out.println("Age : "+ this.Age+" ");
		System.out.println("Roll_no : "+ this.Roll_no+" ");
	}
}

public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Names= {"chimi", "charu", "baru"};
		int [] Ages = {34, 45, 67};
		int [] roll = {45678, 87959, 36788};
		ArrayList<student>lists= new ArrayList<>();
		for (int i=0; i<3; i++) {
			student s1 = new student();
			s1.student(Names[i], Ages[i], roll[i]);
			lists.add(i,s1);
			//lists.get(i).display();
			//System.out.println();
		}
		//lists.get(1).display();
		//System.out.println();
		Iterator<student> iterate=lists.iterator();
		while(iterate.hasNext()) {
			student s = iterate.next();
			System.out.printf("%s\t%d\t%d\t\n",s.Name,s.Age,s.Roll_no);
			//System.out.println(",");
		}
	}

}
