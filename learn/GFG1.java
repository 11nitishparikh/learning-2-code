package learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

class GFG1  
{ 

static long FindBigNum(long n) {
    
	StringBuffer sb = new StringBuffer();
    for(int i=1; i<=n; i++){
    	sb.append(Integer.toBinaryString(i));
    }
    
    long num = Long.valueOf(sb.toString());
    
    
    int decimalNumber = 0, i = 0;
    long remainder;
    double d;
    while (num != 0)
    {
        remainder = num % 10;
        num /= 10;
        d = Math.pow(2, i);
        decimalNumber += remainder * d;
        ++i;
    }
    return decimalNumber;
}
  
//Driver code 
public static void main(String[] args) throws NumberFormatException, IOException  
{ 
   /* bin(7); 
    System.out.println(); 
    bin(4);    */
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter wr = new PrintWriter(System.out);
    long n = Long.parseLong(br.readLine().trim());

    long out_ = FindBigNum(n);
    wr.println(out_);
    wr.close();
    br.close();
} 
} 


