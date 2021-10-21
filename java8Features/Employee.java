package java8Features;

import java.time.LocalDate;
import java.util.Date;

public class Employee implements Comparable<Employee> {
	  private String name;
	  private Integer id;
	  private LocalDate  dob;
	 
	  public Employee(String name, Integer id, LocalDate  dob) {
	    this.name = name;
	    this.id = id;
	    this.dob = dob;
	  }
	 
	  //Getters and Setters of name & age go here
	  public String toString(){
	    return "Employee Name:"+this.name
	        +"  Id:"+this.id
	        +"  Dob:"+this.dob;
	  }
	  //Standard equals() and hashcode() implementations go here

	  
	public LocalDate  getDob() {
		return dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDob(LocalDate  dob) {
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