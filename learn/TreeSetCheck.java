package learn;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetCheck implements Serializable{
	public int i = 10;
	public static int j = 20;
	public transient int k = 30;
	public static void main(String argv[]) {
		TreeSetCheck t = new TreeSetCheck();
		t.i = 15;
		t.k = 35;
		TreeSetCheck.j = 25;
		System.out.println(t.j);
	}
}




