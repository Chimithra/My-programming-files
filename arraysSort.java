package zohoFirst;

import java.util.Arrays;

public class arraysSort {
	public static void main(String [] args) {
		int [] arr = new int [] {5,8,9,6,3,4};
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
