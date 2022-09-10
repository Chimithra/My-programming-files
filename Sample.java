package zohoFirst;
import java.util.Scanner;

public class Sample{
public static void main(String [] args){
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the number : ");
     int n = in.nextInt();
     int m=1;
     for(int i=0; i<n; i++) {
    	 for(int j=0; j<=i; j++) {
    		 System.out.print(m+" ");
    		 m++;
    	 }
    	 System.out.println();
     }
} 
}
