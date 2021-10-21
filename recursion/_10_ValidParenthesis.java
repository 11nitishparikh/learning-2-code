package recursion;

public class _10_ValidParenthesis {

	public static void main(String[] args) {
		int n=2;
		validParenthesis(n,0,0,"");

	}

	private static void validParenthesis(int total, int rightCount, int leftCount, String result) {
		
		if(rightCount == total && leftCount == total) {
			System.out.println(result);
			return;
		}
		if(rightCount > 3 || leftCount > 3){
			return;
		}
		if(rightCount == leftCount || rightCount > leftCount) {
		validParenthesis(total,rightCount+1,leftCount,result+"(");
		validParenthesis(total,rightCount,leftCount+1,result+")");
		}
	}

}
