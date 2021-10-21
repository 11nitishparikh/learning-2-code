package learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class demo{
	int a,b;
	demo(){
		a=10;
		b=20;
	}
	void print() {
		System.out.println(a+""+b);
	}
	
	int f(int a) {
		int c = a++;
		//System.out.println(c);
		return a++;
	}
}

public class TestClass1 {

	
	public static void main(String[] args) throws IOException {

		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> arr = new ArrayList<Integer>();
		String str = br.readLine();
		String[] tokens = str.split(" ");
		for (String token : tokens) {
			arr.add(Integer.parseInt(token.trim()));
		}
		int n = arr.get(0);
		int x = arr.get(1);
		int k = arr.get(2);
		
		String snum = br.readLine();
		int a[] = new int[n/x];
		String[] tokenss = snum.split("(?<=\\G.{"+x+"})");
		int i=0;
		for (String token : tokenss) {
			a[i] = Integer.parseInt(token.trim());
			i++;
		}		
		*/
		int b=1;
	demo t = new demo();
		System.out.println(t.f(b));
		System.out.println(t.f(b));
		
		
	}

}
