package recursion;

import java.util.HashMap;
import java.util.Map;

public class _11_KeypadCharCombination {

	public static void main(String[] args) {
		Map<String, String> keyChar = new HashMap<String, String>();
		keyChar.put("2", "abc");
		keyChar.put("3", "def");
		keyChar.put("4", "ghi");
		keyChar.put("5", "jkl");
		keyChar.put("6", "mno");
		keyChar.put("7", "pqrs");
		keyChar.put("8", "tuv");
		keyChar.put("9", "wxyz");
		
		String ques = "23";
		keypadCharCombination(keyChar,ques,"");
	}

	private static void keypadCharCombination(Map<String, String> keyChar, String ques, String result) {
		
		if(ques.length()==0){
			System.out.println(result);
			return;
		}
		
		if(ques.length() > 0){
		String ch = Character.toString(ques.charAt(0));
		String restLeft = ques.substring(1);
		String code = keyChar.get(ch);
		
		for(int i=0;i<code.length();i++) {
			keypadCharCombination(keyChar, restLeft, result+code.charAt(i));
		}
		}
		
	}

}
