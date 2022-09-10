package zohoFirst;


class Animals{
	String name;
	protected void sound() {
		System.out.println("All Animal are make sound");
	}
	protected void bark() {
		System.out.println("All animal will not bark");
	}
}
class Dog extends Animals{
	protected void bark() {
		System.out.println("The dog "+ name +" make sound as Barking ");
		super.bark();
	}
}
public class inheritancePractice {
	public static void main(String [] args) {
		Dog s1 = new Dog();
		s1.name = "Barby";
		s1.bark();
		s1.sound();
	}

}
