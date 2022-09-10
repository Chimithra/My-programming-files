package zohoFirst;

public class Group {
	public static void main(String [] args) {
		int n = 20;
		int m = n/5;
		for(int i=1; i<=m ; i++) {
			System.out.println("Group No : "+ i);
			int r = 100+i;
			for(int j=1; j<=n/m; j++) {
				System.out.println(r);
				r += m;
			}
		}
	}
}
