public class Butterfly {
    public static void main(String[] args) {
        int n=13;
        for(int i=0; i<n ; i++){
            if(i<n/2) {
                for (int j = 0; j <= i; j++) {
                    if (j % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
            }
            else{
                for (int j = n-1; j >= i; j--) {
                    if (j % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
            }
            System.out.println();
        }
    }
}
