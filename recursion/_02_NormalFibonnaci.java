package recursion;

public class _02_NormalFibonnaci {

	public static void main(String[] args) {
		
		int n=5;
		int first = 0;
		int second = 1;
		System.out.println(first);
		System.out.println(second);
		for(int i=0;i<n;i++){
			int add = first + second;
			System.out.println(add);
			first = second;
			second = add;
		}

	}

}
