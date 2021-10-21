package learn;

import java.util.List;

class Poly {

	static List<String> codeBookTreatmentItemsCheck;
	
	public static void main(String[] args) {

		/*final StringBuilder sb = new StringBuilder("Hello-");
		System.out.println(sb.hashCode());
		sb.append("test");
		System.out.println(sb.hashCode());
		System.out.println(sb);*/
		
		codeBookTreatmentItemsCheck = null;
		System.out.println("hhh");
		for(String s: codeBookTreatmentItemsCheck) {
			System.out.println("checking values: "+s);
		}
	}
	
	/*public void m1() {
		System.out.println("m1");
	}

}

class Poly2 extends Poly1 {
	
	public void m2() {
		System.out.println("m2");
	}
	
	public void m3() {
		System.out.println("m3");
	}
	
}

public class Poly {
	
	public static void main(String[] args) {
		
		Poly1 p1 = new Poly2();
		Poly2 p2 = (Poly2) p1;
		
		p1.m1();
		p2.m2();
		p2.m3();
	}*/
	
}