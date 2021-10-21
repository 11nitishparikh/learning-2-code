package learn;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result9 {

	public static int reductionCost(List<Integer> a) {

		List<Integer> sortList = new ArrayList<>(a);
		Collections.sort(sortList);

		int cost = 0;

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		for (Integer i : sortList) {
			priorityQueue.offer(i);
		}
		int sum = 0;
		while (priorityQueue.size() > 1) {
			
			int smallest = priorityQueue.poll();
			int secondSmallest = priorityQueue.poll();
			sum = smallest + secondSmallest;
			cost = cost + sum;
			priorityQueue.offer(sum);
		}
		return cost;

	}
}

public class Solution9 {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());*/

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
       /* for (int i = 0; i < aCount; i++) {
            int aItem = Integer.parseInt(bufferedReader.readLine().trim());
            a.add(aItem);
        }*/

   
        

       int result = Result9.reductionCost(a);
       
       System.out.println(result);

    /*   bufferedWriter.write(String.valueOf(result));

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}
