package learn;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}
		Set<Integer> s = new LinkedHashSet<Integer>(list);
		System.out.println(s);
		
	}

}
