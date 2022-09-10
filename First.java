package zohoFirst;
import java.util.*;

public class First {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number");	
	int a = in.nextInt();
	switch(a) {
	case 1:
		if(a==1) {
			System.out.println(a + " is equal to 1");
		}
		break;
	case 2:	
		if(a==2) {
			System.out.println(a + " is equal to 2");
		}
		break;	
	case 3:	
		if(a>=3 && a<=5) {
			System.out.println(a + " is in range of 3 to 5");
		}
		break;	
	
	case 6:
		System.out.println(a);
		if(a>5 && a<10) {
			a += 1;
			System.out.println(a + " is in range");
		}
		break;
	default:
		System.out.println("this is not in range");
	}
}
}
