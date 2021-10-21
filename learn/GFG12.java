package learn;

class GFG12 
{
	static int inf = 1000000008; 
    public static int minSteps(int m, int n) { 
        if (n == m) 
            return 0; 
        if (m > n) 
            return inf; 
  
        int min_cost = inf; 
        // Iterate through all possible 
        // even divisors of m 
        for (int i = 2; i < m; i += 2) { 
            // If m is divisible by i, 
            // then find the minimum cost 
            if (m % i == 0) { 
                // Add the cost to convert 
                // m to m+i and recursively 
                // call next state 
                min_cost = Math.min(min_cost,m / i + minSteps(m + i, n)); 
            } 
        } 
  
        return min_cost; 
    } 
    public static void main(String args[]) { 
        int M = 6; 
        int N = 24; 
        int minimum_cost = minSteps(M, N); 

        minimum_cost = minimum_cost == inf ? -1: minimum_cost; 
        System.out.println(minimum_cost); 
    } 
} 