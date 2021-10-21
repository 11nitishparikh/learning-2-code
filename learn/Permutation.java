package learn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Permutation 
{ 
	static Set<String> strSet = new HashSet<String>();
    public static void main(String[] args) 
    { 
        String str = "RB"; 
        int n = str.length(); 
       // System.out.println(n);
        int k = 1;
        Permutation permutation = new Permutation(); 
        permutation.permute(str, 0, n-1); 
        StringBuilder sb = new StringBuilder();
       // System.out.println(strSet.size());
        for(int i=0;i<k+1;i++) {
        	sb.append("R");
        }
       // System.out.println(sb.toString());
        Iterator<String> it = strSet.iterator();

    	while (it.hasNext()) {
    		if (it.next().contains(sb.toString())) {	// remove even elements
    			it.remove();
    		}
    	}
        
    	//System.out.println(strSet.size());
    } 
  
    private void permute(String str, int l, int r) 
    { 
        if (l == r) {
        	strSet.add(str);
           // System.out.println(str); 
        } else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
               // str = swap(str,l,i); 
            } 
        } 
    } 
  
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        System.out.println("charArray: "+String.valueOf(charArray));
        return String.valueOf(charArray); 
    } 
  
} 