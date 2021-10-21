package learn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result1 {

    /*
     * Complete the 'maxSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER_ARRAY arr
     *  2. LONG_INTEGER threshold
     */

	public static long maxSum(List<Long> arr, long threshold) {

		long curr_sum = arr.get(0), max_sum = 0;
		int start = 0;

		for (int i = 1; i < arr.size(); i++) {

			if (curr_sum < threshold)
				max_sum = Math.max(max_sum, curr_sum);

			while (curr_sum + arr.get(i) > threshold && start < i) {
				curr_sum -= arr.get(start);
				start++;
			}

			curr_sum += arr.get(i);
		}

		if (curr_sum < threshold)
			max_sum = Math.max(max_sum, curr_sum);

		return max_sum;

	}

}

public class Solution1 {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());*/

        List<Long> arr = new ArrayList<>();

       /* for (int i = 0; i < arrCount; i++) {
            long arrItem = Long.parseLong(bufferedReader.readLine().trim());
            arr.add(arrItem);
        }*/
arr.add(1l);
arr.add(2l);
//arr.add(4l);
//arr.add(5l);
        long threshold = 3;//Long.parseLong(bufferedReader.readLine().trim());

        long result = Result1.maxSum(arr, threshold);
System.out.println(result);
       /* bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}