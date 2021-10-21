package recursion;

public class _06_CoinToss {

	public static void main(String[] args) {
		int n = 3;
		coinToss(n,"");
	}

	private static void coinToss(int n, String result) {
		if(n==0){
			System.out.println(result);
			return;
		}
		coinToss(n-1,result+"H");
		coinToss(n-1,result+"T");
	}
}
