package gfgArrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test111 {
	
	
		
	public void read(String obj){
		System.out.println("Inside String");
	}
	public void read(Object obj){
		System.out.println("Inside object");
	}
	public void read(int obj){
		System.out.println("Inside String");
	}

	/*public void read(StringBuffer obj){
		System.out.println("Inside StringB");
	}*/

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("chennai");
		l.add("cochin");
		l.add("delhi");
		l.add("noida");
		l.add("chandigarh");
		l.add("Chgarh");
		
		
		
		List<String> l1 = l.stream().filter(name -> (name.startsWith("c")||name.startsWith("C"))).collect(Collectors.toList());
		//List<String> l1 = l.stream().filter(S -> S.toLowerCase().charAt(0) == 'c').collect(Collectors.toList());
		l1.sort(Comparator.reverseOrder());
		
		System.out.println(l1);
		
		Integer a = null;
		int b = 0;
		System.out.println(b);
		
		Test111 t = new Test111();
		t.read(null);
		

	}

}
