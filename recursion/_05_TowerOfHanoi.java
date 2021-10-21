package recursion;

public class _05_TowerOfHanoi {

	public static void main(String[] args) {
		int n = 3;
		towerOfHanoi(n,"src","dest","helper");
	}

	private static void towerOfHanoi(int n, String src, String dest, String helper) {
		if(n==0)
			return;
		towerOfHanoi(n-1,src,helper,dest);
		System.out.println("Move "+n+" disk from "+src+" to "+dest);
		towerOfHanoi(n-1,helper,dest,src);	
	}
}
