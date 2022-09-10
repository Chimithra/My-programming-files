package zohoFirst;
import java.util.Scanner;
import java.lang.String;

public class cross {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = in.next();
		if(str.length()%2 == 1) {
		for(int i=1; i<=str.length(); i++) {
			for(int j=1; j<=str.length(); j++){
				if(i==j){
					System.out.print(str.charAt(i-1));
				}
				else if(i+j == (str.length()+1)) {
					System.out.print(str.charAt(str.length()-i));
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
				}
		}
		else {
			System.out.println(0);
		}
	}
}
	