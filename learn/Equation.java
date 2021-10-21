package learn;

import java.util.Scanner;

public class Equation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Answer = "+findP(n));
		}
		public static int findP(int n){
			int x = (int) Math.pow( (8*n+1), 0.5 );
		int root = (int) ( x -1)/2 ;
		return (int)Math.pow(5,root);
		}
}
