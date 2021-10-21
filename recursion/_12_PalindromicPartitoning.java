package recursion;

public class _12_PalindromicPartitoning {

	public static void main(String[] args) {
		String ques = "nitin";
		palindromicPartitoning(ques,"");
	}

	private static void palindromicPartitoning(String ques, String ans) {
		if(ques.length() == 0){
			System.out.println(ans);
			return;
		}
		for(int i=1;i<=ques.length();i++) {
			String restLeft = ques.substring(i);
			String comp = ques.substring(0, i);
			if(checkPalindrome(comp))
				palindromicPartitoning(restLeft,ans+comp+" ");
		}
	}

	private static boolean checkPalindrome(String str) {
		StringBuilder s = new StringBuilder(str);
		if(str.toLowerCase().equalsIgnoreCase(s.reverse().toString().toLowerCase()))
			return true;
		else
			return false;
	}
}
