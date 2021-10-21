package recursion;

public class _03_RecursiveFibonnaci {

	public static void main(String[] args) {
		int n=5;
		int first = 0;
		int second = 1;
		System.out.println(first);
		System.out.println(second);
		fibo(n,first,second);
	}

	private static void fibo(int n, int first, int second) {
		
		if(n==0)
			return;
		int add = first + second;
		System.out.println(add);
		fibo(n-1,second,add);
		
	}

}
