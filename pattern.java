public class pattern {
    public static void main(String [] args){
        int n = 10;
        for(int i=1; i<n; i++){
            for(int j = 1; j<=(n-1); j++){
                if(i+j >= n && i+j <= n+i) {
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j = n-2 ; j>0; j--){
                if(i+j >= n && i+j < n+i ){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
