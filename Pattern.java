public class Pattern {
    public static void main(String[] args) {
        int n = 8;
        int m = n / 2;
        for (int i = 1; i <= m; i++) {
            for (int j = m; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
          //  for(int k=1 ; k<=i*2-1; k++){
        //    }
            for(int j=i ; j>1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = m-1; i >= 1; i--) {
            for (int j = m-1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for(int j=i ; j>1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}