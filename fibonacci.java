import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the t: ");
        int t=in.nextInt();
        System.out.println("Enter the t1 : ");
        int t1=in.nextInt();
        System.out.println("Enter the t2 : ");
        int t2=in.nextInt();
        int f=0;
        int sum=0, res=1;
        for(int i=3;i<t; i++){
            t1 = t2;
            t2 = sum;
            sum = t1+t2;
            //System.out.println("sum : "+sum);
            res = sum +(int)Math.pow(res,2);
            //System.out.println("res : "+res);
            if(i == t){
                System.out.println("Element in t : "+res);
            }
        }
        System.out.println("Res : "+res);
    }
}