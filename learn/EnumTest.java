package learn;

import java.util.Scanner;

public class EnumTest {
	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		int codeFromDB = scan.nextInt();
		try {
			System.out.println(EmpCode.getEnum(codeFromDB));
		} catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
		scan.close();*/
		
		String s = "abc";
		
		String s1 = s;
		
		System.out.println(s==s1);
		String s2 = new String("abc");
		String str = new String("abc");
		System.out.println(s==s2);
		System.out.println(s1==s2);
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(str));
		
		System.out.println(str==s2);
		
	}

	public enum EmpCode {
		ASSOCIATE, SENIOR_ASSOCIATE, MANAGER, SENIOR_MANAGER;

		public static EmpCode getEnum(int code) {
			switch (code) {
			case 10001:
				return ASSOCIATE;
			case 10002:
				return SENIOR_ASSOCIATE;
			case 10003:
				return MANAGER;
			case 10004:
				return SENIOR_MANAGER;
			default:
				throw new IllegalArgumentException("INVALID EMPLOYEE CODE:" + code);
			}
		}
	} 
}