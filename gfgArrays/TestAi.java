package gfgArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestAi {

	/*public static void main(String[] args) {
		//print first non repeating characters in string google
		String str = "google";
		int length = str.length();
		Map<Character, Integer> countOfchar = new LinkedHashMap<>();
		for(char c: str.toCharArray()) {
			countOfchar.put(c, countOfchar.containsKey(c) ? countOfchar.get(c)+1:1);
		}
		for(Entry<Character,Integer> entryKeys: countOfchar.entrySet()) {
			if(entryKeys.getValue() == 1) {
				System.out.println(entryKeys.getKey());
				break;
			}
		}
	}

}



class GFG {*/
 
    static int countSwap(String str)
    {
     
        int n = str.length();
        char s[] = str.toCharArray();
        int count = 0;
        for (int i = 0; i < n / 2; i++) {
            int left = i;
            int right = n - left - 1;
            while (left < right) {
                if (s[left] == s[right]) {
                    break;
                }
                else {
                    right--;
                }
            }
            
            if (left == right) {
                return -1;
            }
            else {
                for (int j = right;j < n - left - 1; j++) {
                    char t = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = t;
                    count++;
                }
            }
        }
        return count;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        String s = "ntiin";
 
        // Function calling
        int ans1 = countSwap(s);
       
        StringBuilder sb=new StringBuilder(s);  
        sb.reverse();  
        s = sb.toString();  
 System.out.println(ans1);
       // int ans2 = countSwap(s);
       // if(ans1 > ans2)
         // System.out.println(ans1);
        //else
          //System.out.println(ans2);
    }
}
