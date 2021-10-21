package learn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {
	static String process(String str) { 
        int count[] = new int[256]; 
        for (int i = 0; i < str.length(); i++) { 
            count[str.charAt(i)]++; 
        } 
        String start = "", mid = "", end = ""; 
        for (char ch = 'a'; ch <= 'z'; ch++) { 
            if (count[ch] % 2 == 1) { 
                mid = String.valueOf(ch); 
                count[ch--]--; 
            } 
            else { 
                for (int i = 0; i < count[ch] / 2; i++) { 
                	start += ch; 
                } 
            } 
        } 
        end = start; 
        end = reverse(end); 
        return start + mid + end; 
    } 
  
    static String reverse(String str) { 
        String ans = ""; 
        char[] try1 = str.toCharArray(); 
        for (int i = try1.length - 1; i >= 0; i--) { 
            ans += try1[i]; 
        } 
        return ans; 
    } 
  
    public static void main(String[] args) throws IOException { 
        String str = null;
        String filePath = Paths.get("").toAbsolutePath().toString() + "\\input.txt";
		BufferedReader lineReader = new BufferedReader(new FileReader(filePath));
		String lineText = null;

		List<String> listLines = new ArrayList<String>();
		while ((lineText = lineReader.readLine()) != null) {
			listLines.add(lineText);
		}

		lineReader.close();
		for (String line : listLines) {
			str = line;
		}
        int result = process(str).length();
        
        FileWriter writer = new FileWriter(Paths.get("").toAbsolutePath().toString() + "\\output.txt", false);
		writer.write(result);
		writer.close();
        
    } 
} 
