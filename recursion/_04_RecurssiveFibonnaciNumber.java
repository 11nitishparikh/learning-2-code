package recursion;

public class _04_RecurssiveFibonnaciNumber {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(fibo(n));

	}

	private static int fibo(int n) {
		if(n<=1)
			return n;
		
		return (fibo(n-1) + fibo(n-2));
		
	}

}
