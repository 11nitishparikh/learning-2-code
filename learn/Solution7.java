package learn;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result7 {

   
    public static int countBalancingElements(List<Integer> arr) {
    	int count = 0;
        for (int i = 0; i < arr.size(); i++) {
          if (evenIndexValEqualsOddIndexVal(removeElementInArr(arr, i))) {
            count++;
          }
        }
        return count;
    }

	private static boolean evenIndexValEqualsOddIndexVal(int[] removeElementInArr) {
		 int evensum = 0;
		    int oddsum = 0;
		    for (int i = 0; i < removeElementInArr.length; i++) {
		      if (i % 2 == 0) {
		        evensum += removeElementInArr[i];
		      } else {
		        oddsum += removeElementInArr[i];
		      }
		    }
		    return evensum == oddsum && evensum != 0 && oddsum != 0;
		  }

	private static int[] removeElementInArr(List<Integer> arr, int index) {
		int[] result = new int[arr.size() - 1];
	    for (int i = 0, j = 0; i < arr.size() && j < result.length; i++, j++) {
	      if (i == index) {
	        result[j] = arr.get(i + 1);
	        i++;
	      } else {
	        result[j] = arr.get(i);
	      }
	    }
	    return result;
	}

}

public class Solution7 {
    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
*/
        List<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(2);
        arr.add(2);
        //arr.add(4);
        
       /* for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
            arr.add(arrItem);
        }*/

        int result = Result7.countBalancingElements(arr);

        System.out.println(result);
        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}