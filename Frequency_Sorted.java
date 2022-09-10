package Assignment;

import java.util.ArrayList;

public class Frequency_Sorted {
    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 2, 2, 3};
        int count=0;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){
            if(!a.contains(arr[i])) {
                if (arr[i] == arr[i + 1]) {
                    ++count;
                } else {
                    a.add(arr[i]);
                    b.add(count);
                    count=0;
                }
            }
        }
        System.out.print(a +" "+ b);
    }
}
