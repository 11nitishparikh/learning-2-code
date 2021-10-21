package recursion;

public class _07_ClimbingStairs {

	public static void main(String[] args) {
		int n = 5;
		int current = 0;
		climbStairs(n,current,"");

	}

	private static void climbStairs(int n, int current, String result) {

		if(current==n){
			System.out.println(result);
			return;
		}
		if(current<n){
		climbStairs(n,current+1,result+1);
		climbStairs(n,current+2,result+2);
		climbStairs(n,current+3,result+3);
		}
		
	}

}
