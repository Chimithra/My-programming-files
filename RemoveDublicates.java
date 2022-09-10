package Assignment;

import java.util.Arrays;

class Remove {
    void remove(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
class RemoveDublicates{
    public static void main(String[] args) {
        int [] arr = {2, 4, 5, 2, 4, 6, 7, 8};
        Remove r = new Remove();
        r.remove(arr);
    }
}
