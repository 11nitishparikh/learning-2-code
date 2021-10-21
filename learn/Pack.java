package learn;


class A {
	
	public int x;
	protected int y;
	
	void cal(int a, int b) {
		x = a+1;
		y = b;
	}
	
}

class Pack {
	
	
	
	public static void main(String[] args) throws Exception {
		
		Pack p = new Pack();
		System.out.println(p.getValue());
		
		
	}

	int getValue() {
		int r = 10;
		try {
			String[] lan = {"aa","bb"};
			System.out.println(lan[5]);
		}
		catch(Exception e) {
			System.out.println("Catch: "+r);
			return r;
		}finally {
			r += 10;
			System.out.println("finally: "+r);
		}
		return r;
	}

	
}
