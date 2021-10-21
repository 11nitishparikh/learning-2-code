package learn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Priority {

	public static void main(String[] args) {
	/*	PriorityQueue toDo = new PriorityQueue(); 
		toDo.add("di"); 
		toDo.add("lu"); 
        toDo.add("bi"); 
        toDo.add("bi");
        System.out.print(toDo.size()+" "+toDo.poll());
        System.out.print(" "+toDo.peek()+" "+toDo.poll());
        System.out.print(" "+toDo.poll()+" "+toDo.poll());
        
        String[] cities = {"Bang", "Pune", "San F", "New York City"};
        MySort ms = new MySort(); 
        Arrays.sort(cities, ms);
        System.out.println(Arrays.binarySearch(cities, "New York City"));
        
        Map<Integer, String> treeMap1 = new TreeMap<Integer, String>(); 
        treeMap1.put(11, "audi");
        treeMap1.put(null, null);
        treeMap1.put(11, "bmw");
        treeMap1.put(null, "fer");
        System.out.println(treeMap1.size());*/
		
		
		try {
			System.out.println(doStuff(args));
		} catch(Exception e) {
			System.out.println("exe");
			}
			doStuff(args);
		
		
	}
	
	static int doStuff(String[] args) {
		return Integer.parseInt(args[0]);
	}

	/*static abstract class MySort implements Comparator {

		@Override
		public int compare(String a, String b) {
			
			return b.compareTo(a);
		}

		
	}*/
}
