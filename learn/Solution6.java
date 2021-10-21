package learn;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result6 {

    /*
     * Complete the 'groupTransactions' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY transactions as parameter.
     */

	public static List<String> groupTransactions(List<String> transactions) {

		Map<String, Integer> mapTable = new Hashtable<String, Integer>();
		for (int j = 0; j < transactions.size(); j++) {
			if (mapTable.containsKey(transactions.get(j))) {
				mapTable.put(transactions.get(j), (mapTable.get(transactions.get(j)) + 1));
			} else {
				mapTable.put(transactions.get(j), 1);
			}
		}

		LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();

		mapTable.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

		ArrayList<String> valueList = new ArrayList<String>();
		for (String name : reverseSortedMap.keySet()) {
			Integer value = mapTable.get(name);
			valueList.add(name + " " + value);
		}

		return valueList;

	}

}

public class Solution6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int transactionsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> transactions = new ArrayList<>();
        
        for (int i = 0; i < transactionsCount; i++) {
            String transactionsItem = bufferedReader.readLine();
            transactions.add(transactionsItem);
        }

        List<String> result = Result6.groupTransactions(transactions);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));


            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
