package learn;

import java.io.IOException;

class classA {

	void rate() throws IOException {
		
		System.out.println("A");
	}

}

class classB extends classA {
	
	void rate() throws ArithmeticException {
		
		System.out.println("B");
	}

	
}

public class TestException {
	
	public static void main(String[] args) {
		
		Poly4 p1;
		//p1 = new Poly4();
		p1 = new Poly3();
	}
}