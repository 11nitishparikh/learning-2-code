package java8Features;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HahMapToTreeMap {

	public static void main(String args[]) {
		 
		Map<Long, Employee1> map = new HashMap<>();
		 
		LocalDate date1 = LocalDate.of(2006, 02, 15);
		LocalDate date2 = LocalDate.of(2009, 01, 06);
		LocalDate date3 = LocalDate.of(2007, 02, 10);
		 
		Employee1 employee1 = new Employee1(1L, "Mher", date1);
		map.put(employee1.getId(), employee1);
		Employee1 employee2 = new Employee1(2L, "Annie", date2);
		map.put(employee2.getId(), employee2);
		Employee1 employee3 = new Employee1(3L, "John", date3);
		map.put(employee3.getId(), employee3);
		
		Map<Long, String> sor = convertToTreeMap(map); 
		
		System.out.println(sor);
	 }

	private static Map<Long, String> convertToTreeMap(Map<Long, Employee1> map) {
		Map<Long, String> treeMap1 = new TreeMap<Long, String>(); 
		  
        // Convert the HashMap to TreeMap manually 
        for (Map.Entry<Long, Employee1> e : map.entrySet()) { 
            treeMap1.put(e.getKey(), e.getValue().getName()); 
        } 
  
        Map<Long, String> treeMap = map.entrySet().stream()
        		.sorted(Comparator.comparing(Employee1::getDob))
        		//.sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee1::getDob)))
        		.collect(Collectors.toMap(employee1->employee1.getId(), employee1->employee1.getName()));
        
        // Return the TreeMap 
        return treeMap; 
	}
}
