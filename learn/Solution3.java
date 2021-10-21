package learn;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}
		int result = gcd(list.get(0), list.get(1));
		for (int i = 2; i < list.size(); i++) {
			result = gcd(result, list.get(i));
		}
		System.out.println(result);

	}

	public static int gcd(int a, int b) {
		int res = 0;
		while (b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
			res = a;
		}
		return res;
	}

}
