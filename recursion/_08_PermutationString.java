package recursion;

public class _08_PermutationString {

	public static void main(String[] args) {
		String str = "abc";
		permut(str, "");
	}

	private static void permut(String str, String result) {
		if(str.length() == 0){
			System.out.println(result);
			return;
		}
		for(int i=0;i<str.length();i++) {
			String nq= str.substring(0, i) + str.substring(i+1);
			permut(nq,result+str.charAt(i));
		}
	}
}
