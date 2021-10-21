package learn;

import java.util.Scanner;

public class mergeHalfString {

	public static void main(String[] args) {
		
		/*int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n/2];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }
        int z=0;
        for(int j = ((n/2)); j<n; j++) {
        	arr2[z] = arr1[j];
        	z++;
        }*/
        
        String str = "1234567890";
        //String str = "1024";
        String str1 = "";
        int strLength = str.length();
        int strHalfLength = str.length()/2;
       
        if(strLength%2 != 0) {
        	for(int d=0; d<strHalfLength+1; d++) {
            	str1 = str1 + str.charAt(d);
            	if(strLength%2 != 0)
            		str1 = str1 + str.charAt(strLength-1);
            	strLength--;
            }
        }else {
        	for(int d=0; d<strHalfLength; d++) {
            	str1 = str1 + str.charAt(d);
            	str1 = str1 + str.charAt(strLength-1);
            	strLength--;
            }
        }
        
        System.out.println(str1);
        
        
	}

}
