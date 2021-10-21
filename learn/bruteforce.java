package learn;

public class bruteforce {

	public static void main(String[] args) {

		String n = "hello world";
		String m = "o wo";
		int nlen = n.length();
		int mlen = m.length();
		
		for(int i = 0; i < nlen-mlen; i++) {
			int j=0;
			while(j < mlen && n.charAt(i+j) == m.charAt(j)) {
				j++;
			}
			if(j==mlen) {
				System.out.println(i);
			}
		}

	}

}
