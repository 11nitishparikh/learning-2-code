package learn;

public class SpiralMatrix {

	public static void main(String[] args) {

		 int[][] a = { {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16} };
		 spiralPoint(4,4,a);
	}

	private static void spiralPoint(int m, int n, int[][] a) {

		int k=0, l=0;
		
		while(k<m && l<n) {
			
			for(int i=l; i<n; ++i) {
				System.out.println(a[k][i]);
			}
			k++;
			for(int j=k; j<m; j++) {
				System.out.println(a[j][n-1]);
			}
			n--;
			if(k < m) {
				for(int z=n-1; z>=l; --z) {
					System.out.println(a[m-1][z]);
				}
				m--;
			};
			
			if(l < n) {
				for(int y=m-1; y>=k; --y) {
					System.out.println(a[y][l]);
				}
				l++;
			}
			
		}
		
	}

}
