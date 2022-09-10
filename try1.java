package zohoFirst;

	import java.util.*;

	public class try1{
	    public static int B,H;
	    public static boolean flag;
	    static{
	        try (Scanner in = new Scanner(System.in)) {
				B = in.nextInt();
				H = in.nextInt();
			}
	        if(B>0 && H>0){
	            flag = true;
	        }
	        else{
	            System.out.println("java.lang.Exception: Breadth and height must be positive");
	        }
	    }
	}

	//Write your code here

	/*public static void main(String[] args){
			//if(flag){
				//int area=B*H;
				//System.out.print(area);
			//}
			
		}//end of main

	}end of class*/




