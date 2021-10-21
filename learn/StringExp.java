package learn;

public class StringExp {

	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		StringBuilder c = new StringBuilder();
		c.append(a);
		
		System.out.println(a.equalsIgnoreCase(c.toString()));

	}

}
