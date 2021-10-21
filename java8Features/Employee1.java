package java8Features;

import java.time.LocalDate;

public class Employee1 implements Comparable<Employee> {
	 
    private Long id;
    private String name;
    private LocalDate dob;
 
    // constructor, getters, setters
 
    // override equals and hashCode
    public Employee1(Long id, String name, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
    
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
    
	@Override
	  public int compareTo(Employee u) {
	    if (getDob() == null || u.getDob() == null) {
	      return 0;
	    }
	    return getDob().compareTo(u.getDob());
	  } 
    
}