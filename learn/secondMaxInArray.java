package learn;

import java.util.Scanner;

public class secondMaxInArray {

	public static void main(String[] args) {
		
		int n, first = 0, second = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements:");
		for(int i =0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		if(arr.length < 2) {
			System.out.println("INVALID INPUT");
		}
		
		if(arr.length > 2) {
		for(int j=0; j<arr.length; j++) {
			if(arr[j] > first) {
				second = first;
				first = arr[j];
			}else if(arr[j] > second && arr[j] < first && arr[j] != first) {
				second = arr[j];
			}
		}
		System.out.println(first+"---"+second);
		}
		
	}

}
