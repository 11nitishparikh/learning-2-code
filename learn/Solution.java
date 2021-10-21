package learn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

class Result {

    /*
     * Complete the 'getDistanceMetrics' function below.
     *
     * The function is expected to return a LONG_INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Long> getDistanceMetrics(List<Integer> arr) {
    	List<Long> resultList = new ArrayList<Long>();
    	LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer, Integer>(); 
    	
    	for(int i=0;i<arr.size();i++) {
    		map.put(i, arr.get(i));
    	}
    	
    	for(Integer position: map.keySet()) {
    		Integer sum = 0;
    		Integer val = 0;
    		for(int i=0;i<arr.size();i++) {
    			if(map.get(position).equals(arr.get(i))) {
    				val = position-i;
    				sum = sum + (Math.abs(val));
    			}
    		}
    		resultList.add(Long.valueOf(sum));
    	}
		return resultList;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
            arr.add(arrItem);
        }
        
        List<Long> result = Solution8.getDistanceMetrics(arr);

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