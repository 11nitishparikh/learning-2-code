package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class reverseStringAndFreq {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String duplStr = scanner.nextLine();
		String[] tokens = duplStr.split(" ");
		List<String> listStr = new ArrayList<String>();
		LinkedHashMap<String, Integer> freqMap = new LinkedHashMap<String, Integer>();
		StringBuilder result = new StringBuilder();
		int count = 0;
		for (String token : tokens) {
			listStr.add(token);
		}
		for (int j = 0; j < listStr.size(); j++) {
			if (freqMap.containsKey(listStr.get(j))) {
				freqMap.put(listStr.get(j), (freqMap.get(listStr.get(j)) + 1));
			} else {
				freqMap.put(listStr.get(j), 1);
			}
		}
		for (String name : freqMap.keySet()) {
			String key = name;
			Integer value = freqMap.get(name);
			if (value > 1) {
				result.append(key + " ");
				count = count + 1;
			}
		}
		if (count < 1) {
			System.out.println("NA");
		} else {
			System.out.println(result.toString().trim());
		}

	}

}
