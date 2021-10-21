package learn;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.apache.commons.lang3.StringEscapeUtils;

public class ReplaceChar { 
	   public static void main(String args[]) { 
	         
	      // Initialising String 
	      /*String Str = new String("Hello <World> Goodbye & World"); 
	     
	      
	      String unEscapedHTML = StringEscapeUtils.escapeHtml4(Str);
	         
	        System.out.println(unEscapedHTML);*/
		   BigDecimal variableValue = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_UP);
		   System.out.println(variableValue);
		   BigDecimal total = new BigDecimal(1000).multiply(new BigDecimal(100)).divide(new BigDecimal(1000), 2, RoundingMode.HALF_UP);
		   System.out.println(total);
		   String s  = "GTCAG";
		   StringBuilder input1 = new StringBuilder(); 
		   StringBuilder input2 = new StringBuilder(); 
	        input1.append(s); 
	        input1 = input1.reverse(); 
	        String str = input1.toString();
	        for(int i=0; i<str.length();i++) {
	        	if(str.charAt(i) == 'A') {
	        		input2.append('T');
	        	} else if(str.charAt(i) == 'T') {
	        		input2.append('A');
	        	} else if(str.charAt(i) == 'C') {
	        		input2.append('G');
	        	} else if(str.charAt(i) == 'G') {
	        		input2.append('C');
	        	}
	        }
	       
	        System.out.println(input2.toString());
	        int compareTo = (new BigDecimal(-100)).compareTo(new BigDecimal(100));
	        System.out.println(compareTo);
	        
	        
	   } 
	} 