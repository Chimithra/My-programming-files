import java.util.Arrays;

public class StringSelectionSort {
    public static void main(String[] args) {
        String [] s = {"Chimi", "Charu", "Baru","Meenu"};
        int j=0;
        for(int i=0; i<s.length-1; i++){
            int min=i;
            for(j=i+1; j<s.length; j++) {
                int check = s[i].compareTo(s[j]);
                if (check > 0) {
                    min = j;
                }
            }
            if(min != i){
                String temp = s[i];
                s[i] = s[min];
                s[min] = temp;
            }
        }
        System.out.println(Arrays.toString(s));
    }
}
