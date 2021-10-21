package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import org.apache.commons.lang3.builder.CompareToBuilder;

public class Java8Tests {

	public static void main(String[] args) {
		  List<Integer> age = new ArrayList<Integer>();
		  age.add(20);
		  age.add(30);
		  age.add(10);
		  age.add(40);
		  age.add(15);
		  age.add(25);
	      
		  List<Integer> ageGreaterThan20 = age.stream().filter(i -> i>20).collect(Collectors.toList());
		  
		  ageGreaterThan20.forEach((i)-> System.out.println(i));
		  
		  long age25 = age.stream().filter(i -> i==25).count();
		  
		  System.out.println(age25);
		  
		  List<String> names = new ArrayList<String>();
		  names.add("Mahesh");
		  names.add("Suresh");
		  names.add("Ramesh");
		  names.add("Naresh");
		  names.add("Kalpesh");
		  
		  Optional<String> checkSureshName = names.stream().filter(s -> s.equalsIgnoreCase("Suresh")).findAny();
		  
		  if(checkSureshName.isPresent())
			  System.out.println("Present: "+checkSureshName.get());
		  else
			  System.out.println("Not Present");
		  
		  int maxAge = age.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		  System.out.println(maxAge);
		  
		  OptionalInt optMaxAge = age.stream().mapToInt((i -> i)).max();
		  if(optMaxAge.isPresent())
				System.out.println(optMaxAge.getAsInt());
		  
		  System.out.println("----");
		  List<Integer> sortedAge = age.stream().sorted((i1,i2) -> i1.compareTo(i2)).collect(Collectors.toList());
		  List<Integer> sortedAge1 = age.stream().sorted().collect(Collectors.toList());
		  List<Integer> sortedAge2 = age.stream().sorted((i1,i2) -> (i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList());
		  sortedAge.forEach(System.out::println);
		  System.out.println("----");
		  sortedAge1.forEach(i -> System.out.println(i));
		  System.out.println("----");
		  sortedAge2.forEach(i -> System.out.println(i));
		  
		  System.out.println("----");
		  List<String> joinNames = names.stream().map(s -> s).collect(Collectors.toList());
		  String strJoin = String.join(", ",joinNames);
		  
		  System.out.println("----");
		  
		  
		  
		  
		  
		  System.out.println(strJoin);
		  
	}

}
