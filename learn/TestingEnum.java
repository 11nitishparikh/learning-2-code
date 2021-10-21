package learn;

import java.math.BigDecimal;
import java.util.Calendar;

public class TestingEnum {

	public static void main(String[] args) {

		ConfigurationMail e = getErrorMailConfigurations();

		System.out.println(e.getToConfigurationName());
		
		Calendar now = Calendar.getInstance();
		now.add(Calendar.MINUTE, -15);
		
		System.out.println(now.getTime());
		
		
        BigDecimal b1, b2; 
        
        b1 = new BigDecimal(-1); 
        b2 = new BigDecimal("67891.000"); 
  
        if (b1.compareTo(BigDecimal.ZERO) < 0) { 
            System.out.println(b1 + " and " + b2 + " are equal."); 
        } 
        else if (b1.compareTo(BigDecimal.ZERO) == 1) { 
            System.out.println(b1 + " is greater than " + b2 + "."); 
        } 
        else { 
            System.out.println(b1 + " is lesser than " + b2 + "."); 
        } 
		
		
	}

	private static ConfigurationMail getErrorMailConfigurations() {
		return ConfigurationMail.PDFFILEJOB;
	}

}
