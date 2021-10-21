package learn;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args)  
    { 
        int a[] = new int[]{2,2,2,2,5,5,2,3,3}; 
          
        findMajority(a); 
    }

	private static void findMajority(int[] a) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++) {
			
			if(map.containsKey(a[i])) {
				int count = map.get(a[i]) +1; 
				if(count > (a.length/2)) {
					System.out.println("Majority found: "+a[i]);
					return;
				} else {
					map.put(a[i], count);
				}
			} else {
				map.put(a[i], 1);
			}
		}
		System.out.println(" No Majority element"); 
		
	} 

}
