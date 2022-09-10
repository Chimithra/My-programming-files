package zohoFirst;
import java.util.Arrays;

public class Quick1 {
	static int partition(int [] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low-1);
		int temp;
		for(int j=low; j<high; j++) {
			if(arr[low]<=pivot) {
				i++;
			    temp = arr[i];
			    arr[i] = arr[j];
			    arr[j] = temp;
			}
		}
		temp = arr[i+1];
		arr[i+1]= arr[high];
		arr[high]=temp;
		return (i+1);
	}
	public static void  Quicksort(int [] arr, int low, int high) {
		if(low<high) {
			int pi = partition(arr, low, high);
			Quicksort(arr, low, pi-1);
			Quicksort(arr,pi+1,high);
		}
	} 
	public static void main(String [] args) {
		int [] arr = new int [] {3, 5, 4, 7, 8, 2, 9};
		System.out.println("Before Sorting : "+Arrays.toString(arr));
		Quick1.Quicksort(arr, 0, arr.length-1);
		System.out.println("After sorting : "+Arrays.toString(arr));
	}

}

