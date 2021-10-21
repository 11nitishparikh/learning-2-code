package learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

class Poly4 {

	/*static {
		System.out.println("A");
	}
	
	Poly4() {
		System.out.println("B");
	}*/
	void show() {
		System.out.println("A");
	}

}

class Poly3 extends Poly4 {
	
	/*static {
		System.out.println("C");
	}
	
	Poly3() {
		super();
		System.out.println("D");
	}
	*/
	void show() {
		System.out.println("B");
	}
}

public class Poly2 {
	
	public static void main(String[] args) {
		
		Poly4 p1 = new Poly3();
		//p1 = new Poly4();
		//p1 = new Poly3();
		p1.show();
		
	int[] array = {6,9,8};
	List<Double> list = new ArrayList<>();
	list.add(1.0);
	list.add(4.0);
	list.add(16.0);
	Spliterator<Double> sp = list.spliterator();
	while(sp.tryAdvance((n) -> System.out.print(" "+n)));
	System.out.println();
	sp = list.spliterator();
	List<Double> squar = new ArrayList<>();
	while(sp.tryAdvance((n) -> squar.add(Math.sqrt(n))));
	sp = squar.spliterator();
	sp.forEachRemaining((n) -> System.out.print(" "+n));
	}
}