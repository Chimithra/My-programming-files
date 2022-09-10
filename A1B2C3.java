public class A1B2C3 {
    public static void main(String[] args) {
        String s = "a1b2c3";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c >= 49 && c<= 59){
                char m = s.charAt(i-1);
                for(int j=0; j< c; j++){
                    System.out.print(m);
                }
            }
        }
    }
}