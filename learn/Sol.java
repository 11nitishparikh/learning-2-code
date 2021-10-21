package learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;
 
class Sol {
    
     public static class node {
        long data;
        node left;
        node right;   
        
}
     
     static void print(TreeSet<Integer> t1,TreeSet<Integer> t2){
         
        Iterator it1 = t1.iterator();
        while(it1.hasNext())
         System.out.print(it1.next()+" ");
        
        Iterator it2 = t2.descendingIterator();
        while(it2.hasNext())
         System.out.print(it2.next()+" ");
        
        
         System.out.print("\n");
         
     }
  
    
public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   Scanner obj = new Scanner(System.in);
   int n = Integer.parseInt(br.readLine());
   int a[] = new int[n];
   int max=0,maxEle=0,size=n;
   StringTokenizer s= new StringTokenizer(br.readLine());
   for(int i=0;i<n;i++){
       a[i]=Integer.parseInt(s.nextToken());
       if(a[i]>a[max])
           max=i;
   }
   
   TreeSet<Integer> inc = new TreeSet<>();
   TreeSet<Integer> dec = new TreeSet<>();
 
   for(int i=0;i<n;i++){
       if(i<=max)
           inc.add(a[i]);
       else dec.add(a[i]);
   }
   
   maxEle=a[max];
   int t=Integer.parseInt(br.readLine());
   //System.out.println("--------------------"+size);
   while(t-->0){
       int m = Integer.parseInt(br.readLine());
       
       if(m==maxEle)
       {
           
       }
       else if(m<maxEle){
           if(!inc.contains(m))
           {
               inc.add(m);
               size++;
           }
           else if(!dec.contains(m))
           {
               dec.add(m);
               size++;
           }
           
           
       } else if(m>maxEle){
           size++;
           maxEle=m;
           inc.add(m);
       }
       System.out.print(size+"\n");
      
   }
    print(inc,dec);
   
   
}
}