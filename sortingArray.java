package zohoFirst;
import java.util.*;

public class sortingArray {
	public static void main(String []args) {
		int [] arr = {13,2,4,15,12,10,5};
		int n = arr.length;
		int m;
		int [] temp3 = new int [n];
		if (n%2 == 1) {
			n += 1;
			m = n / 2;
		}
		else {
			m = n/2;
		}
		int [] temp1 = new int [m];
		int [] temp2 = new int [n-m];
		int temp;
		for(int i=0 ; i < m; i++) {
			temp1[i] = arr[i];
		}
		for(int i=0; i<m; i++) {
			for(int j=i+1; j<temp1.length; j++) {
			    if(temp1[j] > temp1[i]) {
				    temp = temp1[j];
				    temp1[j] = temp1[i];
				    temp1[i] = temp;
			    }
			}
	}
		//reverse(temp1);
		for(int j=0; j<arr.length-m;j++) {
			temp2[j] = arr[m+j];
		}
		int i=0;
		int j=1;
		for(int k=0; k<m ; k++) {
			if(k<=m-1) {
			temp3[i] = temp1[k];
			i += 2;
			}
			if(k<m-1) {
			temp3[j] = temp2[k];
			j += 2;
			}
		}
		System.out.println(Arrays.toString(temp3));
	}
}
	


