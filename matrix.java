package zohoFirst;

public class matrix {
	public static void main(String [] args) {
		int m1[][] = {{1,2},{3,4}};
		int m2[][] = {{5, 6, 7},{8, 9, 10}};
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m2[i].length; j++) {
				int sum = 0;
				int a;
				for(int k=0; k<m2.length; k++) {
				a = m1[i][k]* m2[k][j];
				sum += a;
	
			}
			System.out.print(sum+" ");
			}
			System.out.println();
		}
	}

}
