package Assignment;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

class  Merge{
    static void merge1(int [] a1, int [] a2, int [] a3){
        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                a3[k++] = a1[i++];
            } else {
                a3[k++] = a2[j++];
            }
        }
        while (i < a1.length) {
            a3[k++] = a1[i++];
        }
        while (j < a2.length) {
            a3[k++] = a2[j++];
            System.out.println("Sorted & Merge Array using merge Sort : "+Arrays.toString(a3));
        }
    }
    static void merge2(int a1[], int a2[], int a3[]){
        Map<Integer,Boolean> m = new TreeMap<>();
        for(int i=0; i<a1.length; i++){
            m.put(a1[i],true);
        }
        for(int j=0; j<a2.length; j++){
            m.put(a2[j],true);
        }
        System.out.println("Sorted Array by Map : ");
        for(Map.Entry<Integer,Boolean> m1 : m.entrySet()){
            System.out.print(+m1.getKey()+" ");
        }
    }
}

public class Merge_SortArray {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 7};
        int[] a2 = {2, 4, 6, 8};
        int[] a3 = new int[a1.length + a2.length];
        Merge.merge1(a1, a2, a3);
        Merge.merge2(a1, a2, a3);
    }
}
