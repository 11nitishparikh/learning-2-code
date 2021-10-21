package gfgArrays;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Test1 {

    public static List<String> funWithAnagrams(List<String> text) {
    	
    	List<String> ans = new ArrayList<String>(); 
    	   
        HashSet<String> found = new HashSet<String> (); 
        
    	for(int i=0;i<text.size();i++){
            
    		String word = text.get(i);
            word = sort(word); 
            if (!found.contains(word)) { 
                ans.add(text.get(i)); 
                found.add(word); 
            } 
            
        	
        	
        }
    	Collections.sort(ans); 
		return ans;

    }

	private static String sort(String inputString)  
	{  
	    char tempArray[] = inputString.toCharArray();  
	    Arrays.sort(tempArray);  
	    return new String(tempArray);  
	} 

}

public class Test {
	public int i = 10;
	public final int j = i;

    public static void main(String[] args) throws IOException {
    	Test a = new Test();
    	a.i = 20;
    	System.out.println(a.j);

        List<String> text = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            text.add("code");
            text.add("aaagmnrs");
            text.add("anagrams");
            text.add("doce");
            
        }

        List<String> result = Test1.funWithAnagrams(text);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }
}
