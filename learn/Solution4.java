package learn;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result4 {

    /*
     * Complete the 'mergeArrays' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {
    	
    	int aSize = a.size();
    	int bSize = b.size();
    	List<Integer> c = new ArrayList<>();
    	int i = 0, j = 0, k = 0; 
        
        while (i<aSize && j <bSize) 
        { 
            if (a.get(i) < b.get(j)) {
                c.add(a.get(i));
                i++;
                k++;
            }
            else {
            	c.add(b.get(j));
            	j++;
            	k++;
            }
        } 
      
        while (i < aSize) {
        	 c.add(a.get(i));
             i++;
             k++;
        }
      
        while (j < bSize) {
        	c.add(b.get(j));
        	j++;
        	k++;
        }
		return c;

    }
}

public class Solution4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(5);
        a.add(7);
        a.add(7);
        for (int i = 0; i < aCount; i++) {
            int aItem = Integer.parseInt(bufferedReader.readLine().trim());
            a.add(aItem);
        }

        int bCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> b = new ArrayList<>();
        
        for (int i = 0; i < bCount; i++) {
            int bItem = Integer.parseInt(bufferedReader.readLine().trim());
            b.add(bItem);
        }
        

        List<Integer> result = Result4.mergeArrays(a, b);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
