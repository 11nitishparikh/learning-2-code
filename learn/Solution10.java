package learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class Solution10 {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    StringBuilder sb = new StringBuilder();
    String line = in.readLine();
    String[] tokens = line.split(",");
    
    List<String> listString = new LinkedList<String>();
    List<Integer> listInteger = new LinkedList<Integer>();
    for (String token : tokens) {
		try {
			int i = Integer.parseInt(token); 
			listInteger.add(i);
		} catch(NumberFormatException e) {
			listString.add(token);
		}
	}
    
    if(listString.size() > 0) {
    	for (int i = 0; i < listString.size(); i++)
    	{           
    	    sb.append(listString.get(i));
    	    if (i + 1 != listString.size())
    	        sb.append(",");
    	}
    }
    if(listInteger.size() > 0) {
    	if(listString.size() > 0)
    		sb.append("|");
    	for (int i = 0; i < listInteger.size(); i++)
    	{           
    	    sb.append(listInteger.get(i));
    	    if (i + 1 != listInteger.size())
    	        sb.append(",");
    	}
    }
    
    System.out.println(sb.toString());
  }
}