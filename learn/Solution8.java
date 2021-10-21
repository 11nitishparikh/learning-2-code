package learn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


class Result8 {

    public static int getAnagram(String s) {
    	int count = 0; 
    	String s1 = s.substring(0, (s.length()/2));
		System.out.println(s1);
		String s2 = s.substring((s.length()/2), s.length());
		System.out.println(s2);
        int letterCount[] = new int[10]; 
        for (int i = 0; i < s1.length(); i++)  
        	letterCount[s1.charAt(i) - '0']++;  
        
        for (int i = 0; i < s2.length(); i++)  
            if (letterCount[s2.charAt(i) - '0']-- <= 0) 
                count++; 
        return count; 
    }
}

public class Solution8 {
	
	public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String s = bufferedReader.readLine();

        int result = Result8.getAnagram(s);
       bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
	}
}
