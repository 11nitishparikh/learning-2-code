package learn;


//java program to find the maximum sum 
//such that no three are consecutive 
import java.io.*; 

class GFG { 

 // Returns maximum subsequence sum such that no three 
 // elements are consecutive 
 static int maxSumWO3Consec(int arr[], int n) 
 { 
     // Stores result for subarray arr[0..i], i.e., 
     // maximum possible sum in subarray arr[0..i] 
     // such that no three elements are consecutive. 
     int sum[] = new int[n]; 

     // Base cases (process first three elements) 
     if (n >= 1) 
         sum[0] = arr[0]; 

     if (n >= 2) 
         sum[1] = arr[0] + arr[1]; 

     if (n > 2) 
         sum[2] = Math.max(sum[1], Math.max(arr[1] + arr[2], arr[0] + arr[2])); 

     // Process rest of the elements 
     // We have three cases 
     // 1) Exclude arr[i], i.e., sum[i] = sum[i-1] 
     // 2) Exclude arr[i-1], i.e., sum[i] = sum[i-2] + arr[i] 
     // 3) Exclude arr[i-2], i.e., sum[i-3] + arr[i] + arr[i-1] 
     for (int i = 3; i < n; i++) 
         sum[i] = Math.max(Math.max(sum[i - 1], sum[i - 2] + arr[i]), 
                           arr[i] + arr[i - 1] + sum[i - 3]); 

     return sum[n - 1]; 
 } 

 // Driver code 
 public static void main(String[] args) 
 { 
     int arr[] = { 100, 1000, 100, 1000, 1 }; 
     int n = arr.length; 
     System.out.println(maxSumWO3Consec(arr, n)); 
 } 
} 
