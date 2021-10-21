package java8Features;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingWithCollectors  {
 
  public static void main(String args[]) throws ParseException {
	 
		/*
		 * String sDate1="11/12/1998"; String sDate2="12/12/1998"; String
		 * sDate3="13/12/1998";
		 * 
		 * LocalDate date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1); LocalDate
		 * date2=new SimpleDateFormat("dd/MM/yyyy").parse(sDate2); LocalDate date3=new
		 * SimpleDateFormat("dd/MM/yyyy").parse(sDate3);
		 */

	LocalDate date1 = LocalDate.of(2019, 02, 15);
	LocalDate date2 = LocalDate.of(2009, 01, 06);
	LocalDate date3 = LocalDate.of(2007, 02, 10);

	List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 111, date1),
			new Employee("Harry Major", 222, date2), new Employee("Ethan Hardy", 333, date3));
	Long count = employeeList.stream().collect(Collectors.counting());
	System.out.println("Employee count: " + count);
    
    List<Employee> employeeList1 = employeeList.parallelStream().filter(employee->employee.getDob().getMonth().equals(Month.FEBRUARY))
    		.collect(Collectors.toList());
    
    Map<Integer, String> eMap = employeeList.parallelStream()
    		.sorted(Comparator.comparing(Employee::getDob))
    		.collect(Collectors.toMap(employee->employee.getId(), employee->employee.getName()));
    
    System.out.println(employeeList1);
    
    System.out.println(eMap);
    
    Long count1=employeeList.parallelStream().filter(employee->employee.getDob().getMonth().equals(Month.FEBRUARY)).
    		collect(Collectors.counting());
    System.out.println("Employee count: "+count1);
  }
}

