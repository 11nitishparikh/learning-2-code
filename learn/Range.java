package learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		
		List<Integer> primeList = new ArrayList<Integer>();
		primeList = findPrimeNumbr(l,r);
		int countNumbr = 0;
		for(int i=1; i<n; i++) {
			for(Integer primeNumbr: primeList) {
				if(i%primeNumbr==0) {
					countNumbr++;
					break;
				}
			}
		}
		
		System.out.println(countNumbr);

	}

	private static List<Integer> findPrimeNumbr(int l, int r) {
		int m=0, flag = 0, count=0;
		List<Integer> primeList = new ArrayList<Integer>();
		for(int i = l+1; i<r; i++) {
			flag = 0;
			m=i/2;
			if(i==0||i==1) {
				continue;
			} else {
				for(int j=2; j<=m; j++) {
					if(i%j==0) {
						flag = 1;
						break;
					}
				}
				if(flag==0) {
					primeList.add(i);
					count++;
				}
			}	
		}
		return primeList;
	}

}
