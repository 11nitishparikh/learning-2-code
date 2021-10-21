package arrays;

public class CheckNumbrBeautiful {

	public static void main(String[] args) {
		
		int l = 31;
		int r = 32;
		long out = solve(l,r);
		System.out.println(out);
		

	}

	private static long solve(int l, int r) {
		if(l <= r) {
            if(l==1 && r==1)
                return 1;
            int sum = 0;
           while(l<=r){
                if(checkNumBeautiful(l)) {
                    sum = sum + l;
                    l++;
                }
                else
                	l++;
           }
            return sum;
       } 
       else
        return 0; 
	}

	private static boolean checkNumBeautiful(int num) {
		while(num!=1 && num!=4){
			num = sumOfDigitSquare(num);
		}
		if(num==1)return true;
		
		return false;
	}

	private static int sumOfDigitSquare(int num) {
		int sqr = 0;
		while(num != 0){
			int d = num%10;
			sqr += d * d;
			num = num/10;
		}
		return sqr;
	}

}
