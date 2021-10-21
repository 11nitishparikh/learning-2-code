package learn;


//Java program for the above approach
class GFG13{

static int INF = -1;
static int result = 0;

static int min_op(int cur, int M)
{
	if (cur > M)
		return INF;
	if (cur == M)
		return 0;

	int op = INF;
	
	for (int i = 2; i * i <= cur; i++) 
	{
		if (cur % i == 0)
		{
			// if i is even
			if (i % 2 == 0) 
			{
				
				op = Math.min(op, 1 + min_op(cur + i, M));
			}
			// Check another divisor
			if ((cur / i) != i && (cur / i) % 2 == 0) 
			{
				// Find recursively
				// for cur+(cur/i)
				op = Math.min(op, 1 + min_op(
								cur + (cur / i), M));
			}
		}
	}
	return op;
}


static void min_operations(int N, int M)
{
	int op = min_op(N, M);
	if (op >= INF)
		System.out.print("-1");
	else
		System.out.print(op + "\n");
}

public static void main(String[] args)
{
	int N = 6, M = 24;
	min_operations(N, M);
}
}
