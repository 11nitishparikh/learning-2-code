package learn;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Employee implements Comparable<Employee> {
    private Integer id = 0;
    
    public Employee(Integer id) {
        this.id = id;
    }

    public Integer getId() {
           return id;
    }

    public void setId(Integer id) {
           this.id = id;
    }  

    
    public int compareTo(Employee o) {
        return this.id - o.id; 
    }

    
    public int hashCode() {
        return id;
    }
    
    
    public boolean equals(Object obj) {
        if(obj instanceof Employee) {
            return compareTo((Employee)obj)==0;
        }
        return false;
    }


}

public class HashSetPro {
	
	public static void main(String[] args) {
		Set<Employee> hset = new HashSet<Employee>();
		Scanner s = new Scanner(System.in);
		String intValues = s.nextLine();
		
		String[] values = intValues.split("\\s");
		for(String v: values) {
			hset.add(new Employee(Integer.parseInt(v)));
			
		}
		System.out.println(hset.size());
	}

}
