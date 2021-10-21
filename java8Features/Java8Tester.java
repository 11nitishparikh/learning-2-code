package java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java8Tester {
	
	public static void main(String args[]) {
		   
	     
	      List<String> names2 = new ArrayList<String>();
	      names2.add("Mahesh ");
	      names2.add("Suresh ");
	      names2.add("Ramesh ");
	      names2.add("Naresh ");
	      names2.add("Kalpesh ");
	      
	      Java8Tester java8Tester = new Java8Tester();
	      java8Tester.sortUsingJava8(names2);
	      System.out.println(names2);
	}

	public void sortUsingJava8(List<String> names2) {
		Collections.sort(names2, (s1,s2) -> s1.compareTo(s2));
	}
}
