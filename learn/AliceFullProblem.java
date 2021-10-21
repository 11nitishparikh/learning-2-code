package learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AliceFullProblem {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] strArray = new String[n];
		for(int i = 0; i < n; i++) {
			strArray[i] = scanner.nextLine();
		}
		int[] count = new int[n];
		count = getMaxScore(strArray,n,count);
		for(int i = 0; i < n; i++) {
			System.out.println(count[i]);
		}
		
	}

	private static int[] getMaxScore(String[] strArray, int n, int[] count) {
		//StringBuilder sb = new StringBuilder();
		Map<Character, Integer> freqMap = new HashMap<Character, Integer>();
		
		freqMap.clear();
		int max = 0;
		int curr = 0;
		String str = "";
		for(int i=0; i<n; i++) {
			StringBuilder sb = new StringBuilder();
			freqMap.clear();
			max = 0;
			curr = 0;
			str = strArray[i];
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if(freqMap.containsKey(c)) {
					freqMap.put(c, freqMap.get(c)+1);
				} else {
					freqMap.put(c, 1);
				}
				
				if(sb.length()==0) {
					curr = 0;
				} else if(sb.length()==1) {
					curr = 1;
				} else {
					curr = sb.length();
				}
				sb.append(c);
				
				for(Character c1: freqMap.keySet()) {
					if(freqMap.get(c1)>2) {
						curr = curr - freqMap.get(c1);
						if (c == c1)
							curr += 3;
						else
							curr += 2;
					} 
				}
				
				max = max + curr;
			}
			
			count[i] = max;
		}
		
		
		
		return count;
	}

}
