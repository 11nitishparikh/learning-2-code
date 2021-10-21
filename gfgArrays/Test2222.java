package gfgArrays;


class A1111 {
	public void walk() {
		System.out.println("A: walk");
	}
	
	public void run(){
		System.out.println("A: run");
		walk();
	}
}

class B11111 extends A1111 {
	public void walk() {
		System.out.println("B: walk");
		super.walk();
	}
	
	public void run() {
		System.out.println("B: run");
		super.run();
	}
}

public class Test2222 {
	
	public static void main(String[] args) {
		A1111 a = new B11111();
		a.run();
	}
}
