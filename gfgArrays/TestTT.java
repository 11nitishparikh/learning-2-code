package gfgArrays;

import java.util.HashMap;
import java.util.Map;

public class TestTT {
	
	int i=0;

	public static void main(String[] args) {
		String str = "abc";
		String str1  = str;
		String str2 = new String("abc");
		String str3 = null;
		str="123";
		System.out.println(str==str1);	
		System.out.println(str2==str1);
		System.out.println(str3==str1);
		System.out.println(str.equals(str1));
		System.out.println(str2.equals(str1));	
		//System.out.println(str3.equals(str1));	



		Map<String, String> mapL = new HashMap<String, String>();
		mapL.put("Nitish", "Mphasis");
		mapL.put("Nasar", "Mphasis1");

		String s = mapL.put("Nitish","123");
		System.out.println(s);
		
		
		
		int i=1;
		i = change(i);
		System.out.println(i);
	}

	public static int change(int i) {
		i=2;
		i*=2;
		return i;
	}

}
