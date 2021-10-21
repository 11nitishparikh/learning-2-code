package gfgArrays;

abstract class A {
	{
			System.out.println("default A");
	}
	static {
		System.out.println("static A");
	}
	public void print() {
		System.out.println("AA");
	}
}

class B extends A{
	B(){
		System.out.println("constructor B");
	}
	static {
		System.out.println("static B");
	}
	{
		System.out.println("default B");
	}
	public void print() {
		System.out.println("BB");
	}
}

class C extends B{
	C(){
		System.out.println("contructor C");
	}
	static {
		System.out.println("static c");
	}
	{
		System.out.println("default C");
	}
	public void print() {
		System.out.println("C");
	}
}

public class test444 {

	public static void main(String[] args) {
		B a = new C();
		
	}

}
